package hw;

import java.util.Scanner;

public class hw5{
    static Scanner sc = new Scanner(System.in);
    Student[] arrStudents = new Student[100];
    static hw5 h = new hw5();
    int currentIndex = 0;
    public static void main(String[] args) {
        // Hiển thị menu và thực hiện chức năng
        do{
            System.out.println("********************MENU********************");
            System.out.println("1. Danh sách sinh viên");
            System.out.println("2. Thêm mới các sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên");
            System.out.println("4. Xóa thông tin sinh viên");
            System.out.println("5. Tính năm sinh cho sinh viên");
            System.out.println("6. Tìm kiếm sinh viên theo tên sinh viên");
            System.out.println("7. Sắp xếp sinh viên theo năm sinh tăng dần");
            System.out.println("8. Thoát");
            System.out.println("Lựa chon của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    h.displayListStudent();
                    break;
                case 2:
                    h.inputListStudent();
                    break;
                case 3:
                    h.updateStudent();
                    break;
                case 4:
                    h.deleteStudent();
                    break;
                case 5:
                    h.calYearOfListStudent();
                    break;
                case 6:
                    h.searchStudentByName();
                    break;
                case 7:
                    h.sortStudentByYearAsc();
                    break;
                case 8:
                    return;
                default:
                    System.err.println("Vui lòng chọn từ 1-8");
            }
        }while (true);
    }
    public void displayListStudent(){
        for (int i = 0; i < currentIndex; i++) {
            arrStudents[i].displayData();
        }
    }
    public void inputListStudent(){
        System.out.println("Nhập thông tin cho sinh viên: ");
        int numsOfStudents = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numsOfStudents; i++) {
            // Nhập thông tin
            //1. Khởi tạo phần tử currentIndex là 1 đối tượng sinh viên
            arrStudents[currentIndex] = new Student();
            //2. Nhập thông tin cho phần tử currentIndex
            arrStudents[currentIndex].inputData(sc,arrStudents,currentIndex);
            //3. Tăng currentIndex
            currentIndex++;

        }
    }

    public void updateStudent(){
        System.out.println("Nhập vào mã sinh viên cần cập nhật thông tin: ");
        String studentId = sc.nextLine();
        int indexUpdate =h.getIndexByStudentId(studentId);
        if(indexUpdate>=0){
            // Có tồn tại ---> Cập nhật thông tin sinh viên
            boolean isExist = true;
            do{
                System.out.println("1. Cập nhật tên sinh viên");
                System.out.println("2. Cập nhật tuổi sinh viên");
                System.out.println("3. Cập nhật giới tính sinh viên");
                System.out.println("4. Cập nhật địa chỉ sinh viên");
                System.out.println("5. Cập nhật số điện thoại sinh viên");
                System.out.println("6. Thoát");
                System.out.println("Lựa chọn của bạn: ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Nhập vào tên sinh viên cần cập nhật: ");
                        arrStudents[indexUpdate].setStudentName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Nhập vào tuổi sinh viên cần cập nhật: ");
                        arrStudents[indexUpdate].setAge(Integer.parseInt(sc.nextLine()));
                        arrStudents[indexUpdate].calYear();
                        break;
                    case 3:
                        System.out.println("Nhập vào giới tính sinh viên cần cập nhật: ");
                        arrStudents[indexUpdate].setSex(Boolean.parseBoolean(sc.nextLine()));
                        break;
                    case 4:
                        System.out.println("Nhập vào địa ch sinh viên cần cập nhật: ");
                        arrStudents[indexUpdate].setAddress(sc.nextLine());
                        break;
                    case 5:
                        System.out.println("Nhập vào số điên thoại sinh viên cần cập nhật");
                        arrStudents[indexUpdate].setStudentId(sc.nextLine());
                        break;
                    case 6:
                        isExist = false;
                    default:
                        System.out.println("Nhập từ 1-6");
                }
            }while (isExist);
        }else{
            // Không tồn tại
            System.err.println("Không tồn tại mã sinh viên");
        }
    }

    public int getIndexByStudentId (String studentId){
        for (int i = 0; i < currentIndex; i++) {
            if(arrStudents[i].getStudentId().equals(studentId)){
                return i;
            }
        }
        return -1;
    }

    public void deleteStudent(){
        System.out.println("Nhập vào mã sinh viên cần xóa: ");
        String studentId = sc.nextLine();
        int indexDelete = h.getIndexByStudentId(studentId);
        if(indexDelete>0){
            for (int i = indexDelete; i < currentIndex-1; i++) {
                arrStudents[i] = arrStudents[i+1];
            }
            // gán phần tử cuối cùng là null
            arrStudents[currentIndex-1]=null;
            currentIndex--;
        }else{
            System.err.println("Mã sinh viên không tồn tại");
        }
    }

    public void calYearOfListStudent(){
        for (int i = 0; i < currentIndex; i++) {
            arrStudents[i].calYear();
        }
    }

    public void searchStudentByName(){
        System.out.println("Nhập vào tên sinh viên: ");
        String studentNameSearch = sc.nextLine();
        System.out.println("Các sinh viên tìm được: ");
        int countStudent = 0;
        for (int i = 0; i < currentIndex; i++) {
            if(arrStudents[i].getStudentName().toLowerCase().contains(studentNameSearch.toLowerCase())){
                arrStudents[i].displayData();
                countStudent++;
            }
        }
        System.out.printf("Tìm thấy %d sinh viên phù hợp \n", countStudent);
    }

    public void sortStudentByYearAsc(){
        for (int i = 0; i < currentIndex-1; i++) {
            for (int j = i+1; j < currentIndex; j++) {
                if(arrStudents[i].getYear()>arrStudents[i].getYear()){
                    Student temp = arrStudents[i];
                    arrStudents[i] = arrStudents[j];
                    arrStudents[j] = temp;
                }
            }
        }
    }
}
