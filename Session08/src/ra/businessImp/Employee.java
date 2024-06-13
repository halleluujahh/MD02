package ra.businessImp;

import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee implements IEmployee {

    private String id;
    private String name;
    private int year;
    private float rate;
    private float commission;
    private float salary;
    private boolean status;

    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner, Employee[] listE, int currentIndex) {
        this.id = inputEmployeeId(scanner, listE, currentIndex);
        this.name = inputEmployeeName(scanner);
        this.year = inputYear(scanner);
        this.rate = inputRate(scanner);
        this.commission = inputCommission(scanner);
        this.status = inputStatus(scanner);
    }

    public void updateData(Scanner scanner) {
        this.name = inputEmployeeName(scanner);
        this.year = inputYear(scanner);
        this.rate = inputRate(scanner);
        this.commission = inputCommission(scanner);
        this.status = inputStatus(scanner);
    }

    private boolean inputStatus(Scanner scanner) {
        String status;
        while (true) {
            System.out.println("Enter status: ");
            status = scanner.nextLine();
            if (status.equals("true") || status.equals("false")) {
                return Boolean.parseBoolean(status);
            } else {
                System.err.println("only true or false");
            }
        }
    }

    private float inputSalary(Scanner scanner) {
        float salary;
        while (true) {
            System.out.println("Enter salary: ");
            try {
                salary = Float.parseFloat(scanner.nextLine());
                return salary;
            } catch (NumberFormatException e) {
                System.out.println("Invalid rate!");
            }

        }
    }

    private float inputCommission(Scanner scanner) {
        float commission;
        while (true) {
            System.out.println("Enter commission: ");
            try {
                commission = Float.parseFloat(scanner.nextLine());
                return commission;
            } catch (NumberFormatException e) {
                System.out.println("Invalid rate!");
            }

        }
    }

    private float inputRate(Scanner scanner) {
        float rate;
        while (true) {
            System.out.println("Enter rate: ");
            try {
                rate = Float.parseFloat(scanner.nextLine());
                return rate;
            } catch (NumberFormatException e) {
                System.out.println("Invalid rate!");
            }

        }
    }

    private int inputYear(Scanner scanner) {
        String year;
        String yearRegex = "\\d{4}";
        while (true) {
            System.out.println("Enter year: ");
            year = scanner.nextLine();
            if (Pattern.matches(yearRegex, year)) {
                return Integer.parseInt(year);
            } else {
                System.out.println("Invalid year!");
            }
        }
    }

    private String inputEmployeeName(Scanner scanner) {
        String name;
        String nameRegex = "\\w{2,}";
        while (true) {
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            if (Pattern.matches(nameRegex, name)) {
                return name;
            } else {
                System.out.println("Invalid name!");
            }
        }
    }

    public String inputEmployeeId(Scanner scanner, Employee[] listE, int currentIndex) {
        String id;
        String idRegex = "E\\d{3}";
        while (true) {
            boolean flag = false;
            System.out.println("Enter id: ");
            id = scanner.nextLine();
            if (Pattern.matches(idRegex, id)) {
                for (int i = 0; i < currentIndex; i++) {
                    if (listE[i].getId().equals(id)) {
                        System.out.println("Đã tồn tại nhân viên với ID " + id);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    return id;
                }

            } else {
                System.out.println("Invalid ID!");
            }
        }
    }

    @Override
    public void displayData() {

        System.out.printf("%-10s|%-10s|%-10d|%-10.0f|%-10.0f|%-10.0f|%-10s%n",
                this.id, this.name, this.year, this.rate, this.commission, this.salary, this.status ? "Đang làm việc" : "Nghỉ việc");
    }


}
