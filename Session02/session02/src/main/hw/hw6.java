package main.hw;

public class hw6 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên từ 1-100: ");
        int count = 0;
        int number = 2;
        while(count<20){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                System.out.printf("%d\t", number);
            }
            number++;
        }
    }
}
