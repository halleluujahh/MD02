package main.decisionMaking;

import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float TICKET_PRICE = 7000;
        float ticket;
        System.out.println("Nhập vào số tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        if (age < 6 || age > 60) {
            ticket = 0;
        } else if (age < 18) {
            ticket = 0.5F * TICKET_PRICE;
        } else {
            ticket = TICKET_PRICE;
        }
        System.out.printf("Giá vé xe: %.1f VND\n", ticket);
    }
}
