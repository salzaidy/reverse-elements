class ArrayOperations {

    public static void main(String[] args) {
        int[][] ar = {{0, 0, 9, 9}, {1, 2, 3, 4}, {5, 6, 7, 8}};

        reverseElements(ar);
    }
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        
        for (int i = 0; i < twoDimArray.length; i++) {

            int aL = twoDimArray[i].length;
            for (int j = 0; j < twoDimArray[i].length / 2; j++) {

                int temp = twoDimArray[i][j];

                twoDimArray[i][j] = twoDimArray[i][aL - j -1];

                twoDimArray[i][aL - j -1] = temp;

            }

        }

    }


    public static void reverseElements2(int[][] arr) {

        for (int i =0 ; i < arr.length; i++) {
            for (int j = arr[i].length-1; j >= 0 ; j--) {
    //                System.out.println(j);

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}