package ra.static_demo;

import static ra.static_demo.AppConfig.*;

public class ConnectionDB {
    public static void main(String[] args) {
        System.out.println("Driver: " + DRIVER);
        System.out.println("Url: " + URL);
        System.out.println("username:" + USER_NAME);
        System.out.println("password:" + PASSWORD);
    }

}
