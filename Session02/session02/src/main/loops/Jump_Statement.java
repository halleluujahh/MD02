package main.loops;

public class Jump_Statement {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if(i == 3){
               break;// output: 0,1,2
            }
            System.out.println(i);
        }
    }
}
