package main.hw;

import java.util.Arrays;
import java.util.LinkedList;

public class hw3 {
    public static void main(String[] args) {
//        System.out.println("những số chia hết cho cả 3 và 5 trong khoảng từ 1 đến 100: ");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.printf("%d\t", i);
//            }
//        }
//        System.out.println();
        LinkedList<String> list = new LinkedList<>(

                Arrays.asList("A", "B", "C", "D", "E")

        );

        // using index to iterate through the list

        for(int index = 0; index < list.size(); index++) {

            System.out.println("Element of list at index " + index + " is: " + list.get(index));

        }
    }
}
