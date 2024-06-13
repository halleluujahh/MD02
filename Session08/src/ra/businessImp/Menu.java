package ra.businessImp;

import java.util.Scanner;

public class Menu {
    public static Employee[] listEmployee = new Employee[100];
    public static int currentIndex = 0;
    public static final float BASIC_SALARY = 1300000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("********************MENU*********************");
            System.out.println("1. Nhập thông tin cho n nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên ");
            System.out.println("3. Tính lương cho các nhân viên ");
            System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên ");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Xóa nhân viên theo mã nhân viên ");
            System.out.println("7. Sắp xếp nhân viên theo lương tăng");
            System.out.println("10. Thoát ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        inputData(sc);
                        break;
                    case 2:
                        displayEm();
                        break;
                    case 3:
                        calculateSalary();
                        break;
                    case 4:
                        searchEmployee(sc);
                        break;
                    case 5:
                        updateEm(sc);
                        break;
                    case 6:
                        deleteEm(sc);
                        break;
                    case 7:
                        sortEmAsc();
                        break;
                    case 10:
                        System.out.println("Thoát chương trình ...!");
                        return;
                    default:
                        System.err.println("Nhập từ 1-7 (10 để thoát)");
                }
            } catch (NumberFormatException e) {
                System.err.println("Chỉ được nhập số");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void sortEmAsc() {
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = i + 1; j < currentIndex; j++) {
                if (listEmployee[i].getSalary() > listEmployee[j].getSalary()) {
                    Employee temporal = listEmployee[i];
                    listEmployee[i] = listEmployee[j];
                    listEmployee[j] = listEmployee[i];
                }
            }
        }
        System.out.println("Đã sắp xếp nhân viên xong");
    }

    public static void deleteEm(Scanner sc) {
        System.out.println("Nhập vào ID nhân viên muốn xóa: ");
        String idToUpdate = sc.nextLine();
        int indexOfEmDelete = 0;
        boolean flag = false;
        for (int i = 0; i < currentIndex; i++) {
            if (listEmployee[i].getId().equals(idToUpdate)) {
                indexOfEmDelete = i;
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy nhân viên");
            return;
        }
        for (int i = indexOfEmDelete; i < currentIndex; i++) {
            listEmployee[i] = listEmployee[i + 1];
        }
        listEmployee[currentIndex - 1] = null;
        System.out.println("Đã xóa nhân viên với ID " + idToUpdate);
        currentIndex--;
    }

    public static void updateEm(Scanner sc) {
        System.out.println("Nhập vào ID nhân viên muốn cập nhật: ");
        String idToUpdate = sc.nextLine();
        for (int i = 0; i < currentIndex; i++) {
            if (listEmployee[i].getId().equals(idToUpdate)) {
                System.out.println("Nhập thông tin cập nhật cho nhân viên với ID " + listEmployee[i].getId() + " :");
                listEmployee[i].updateData(sc);
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
    }

    public static void searchEmployee(Scanner sc) {
        System.out.println("Nhập tên nhân viên: ");
        String emName = sc.nextLine();
        for (int i = 0; i < currentIndex; i++) {
            if (listEmployee[i].getName().equals(emName)) {
                System.out.println("Nhân viên đã tìm thấy: ");
                listEmployee[i].displayData();
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
    }

    public static void inputData(Scanner sc) {
        System.out.println("Nhập vào số nhân viên muốn thêm: ");
        int numberEm = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberEm; i++) {
            listEmployee[currentIndex] = new Employee();
            listEmployee[currentIndex].inputData(sc, listEmployee, currentIndex);
            currentIndex++;
        }
    }

    public static void displayEm() throws InterruptedException {
        boolean isExist = false;
        System.out.printf("%-25s%s%25s%n","", "DANH SÁCH NHÂN VIÊN", "");
        System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s%n"
                , "Id", "Name", "Year", "Rate", "Commission", "Salary", "Status");
        for (int i = 0; i < currentIndex; i++) {
            listEmployee[i].displayData();
            isExist = true;
        }
        if (!isExist) {
            System.err.println("Danh sách hiện tại trống");
        }
        Thread.sleep(500);
    }

    public static void calculateSalary() {
        float salary;
        boolean isExist = false;
        for (int i = 0; i < currentIndex; i++) {
            listEmployee[i].setSalary(listEmployee[i].getRate() * Menu.BASIC_SALARY + listEmployee[i].getCommission());
            isExist = true;
        }
        if (isExist) {
            System.out.println("Đã tính lương xong");
        }else{
            System.err.println("Danh sách hiện tại trống");
        }
    }
}
