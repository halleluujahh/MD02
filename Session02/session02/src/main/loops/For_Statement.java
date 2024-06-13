package main.loops;

public class For_Statement {
    public static void main(String[] args) {
        System.out.println("Các số chẵn 1-10: ");
        for (int i = 1; i <= 10; i++) {
            if(i%2==0){
                System.out.printf("%d \t", i);
            }
        }
        System.out.println();
    }
}
