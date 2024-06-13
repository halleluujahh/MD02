package main;

import java.util.Scanner;

public class Validate {
    private static Scanner sc = new Scanner(System.in);

    public int checkInputChoice() {
        int n;
        System.out.println("Enter your choice:");
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine().trim());
                if (n < 0 || n > 6) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number in range [0-6]");
                System.out.println("Enter again your choice: ");
            }
        }
    }

    public int checkInputInt(String s) {
        int n;
        System.out.println("Enter " + s + ":");
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine().trim());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
                System.out.println("Enter again " + s + ":");
            }
        }
    }

    public String checkInputString(String s) {
        String n;
        System.out.println("Enter " + s + ":");
        while (true) {
            n = sc.nextLine().trim();
            if (n.isEmpty()) {
                System.out.println("Không được để trống !");
                System.out.println("Enter again " + s + ":");
            } else {
                return n;
            }
        }
    }

    public double checkInputDouble(String s) {
        double n;
        System.out.println("Enter " + s + ":");
        while (true) {
            try {
                n = Double.parseDouble(sc.nextLine().trim());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
                System.out.println("Enter again " + s + ":");
            } finally {
                System.out.println("Bạn đã nhập đúng kiểu dữ liệu");
            }
        }
    }

    public boolean checkInputYN() {
        String s;
        System.out.println("Please enter (Y/N): ");
        while (true) {
            try {
                s = sc.nextLine().trim();
                if (s.equals("Y")) {
                    return true;
                } else if (s.equals("N")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Please enter (Y/N): ");
            }
        }
    }

    public boolean checkInputUD() {
        String s;
        System.out.println("Please enter (U/D): ");
        while (true) {
            try {
                s = sc.nextLine().trim();
                if (s.equals("U")) {
                    return true;
                } else if (s.equals("D")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Please enter (U/D): ");
            }
        }
    }

}
