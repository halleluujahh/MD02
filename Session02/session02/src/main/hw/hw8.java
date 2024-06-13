package main.hw;

import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float edge1, edge2, edge3, perimeter, area;
        while (true) {
            System.out.print("Enter three edge of triangle: ");
            edge1 = Float.parseFloat(sc.nextLine());
            edge2 = Float.parseFloat(sc.nextLine());
            edge3 = Float.parseFloat(sc.nextLine());
            if (edge1 + edge2 > edge3 || edge2 + edge3 > edge1 || edge1 + edge3 > edge2) {
                perimeter = edge1 + edge2 + edge3;
                float halfPerimeter = perimeter/2;
                area = (float) Math.sqrt(halfPerimeter*(halfPerimeter-edge1)*(halfPerimeter-edge2)*(halfPerimeter-edge3));
                break;
            }
        }
        System.out.printf("Chu vi %.2f \n", perimeter);
        System.out.printf("Diện tích %.2f", area);
    }
}
