package main.loops;

public class ForEach_Statement {
    public static void main(String[] args) {
        int[] number = {3,6,8,4,9,10};
        System.out.println("Các số chẵn trong mảng numbers: ");
        for (int element : number) {
            if(element%2==0){
                System.out.printf("%-10d", element);
            }
        }
        System.out.println();
    }
}
