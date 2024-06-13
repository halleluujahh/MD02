public class tétt {
    public static void main(String[] args) {
        int[][] arr = new int[11][11];
        /*
         *
         *           *****
         *            ***
         *             *
         *
         * */
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (j == arr.length / 2 || i == arr.length / 2) {
//                    System.out.print("*");
//                } else if (i > 0 && i < arr.length / 2 && j >= arr.length / 2 - i && j <= arr.length / 2 + i) {
//                    System.out.print("*");
//
//                } else if (i > arr.length / 2 && i < arr.length - 1
//                        && j >= i - arr.length / 2 && j < arr.length - i + arr.length / 2
//                ) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
        /*
        *       *******
        *        *   *
        *         * *
        *          *
        *         * *
        *        *   *
        *       *******
        * */
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if(i==0||i==arr.length-1){
//                    System.out.print("*");
//                }else if(j==arr.length-1-i&&i>=0||i==j) {
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        /*
        *
        *       **** ****
        *       *  * *  *
        *       **** ****
        *
        *      ***********
        *      *         *
        *       *********
        *
        * */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if((i< arr.length/2 && j!= arr.length/2 && j!= 0 && j!= arr.length-1)){
                    if(i>0 && i<arr.length/2-1 && (j>1 && j<arr.length/2 || j>arr.length/2+1 && j<arr.length-1)){
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
