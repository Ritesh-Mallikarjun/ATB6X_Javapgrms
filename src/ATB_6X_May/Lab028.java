package ATB_6X_May;

public class Lab028 {
    public static void main(String[] args) {
        System.out.println("This program is to print the diagonal in the 2d array");
        int[][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //int[][] arr2=new int[3][3];

        System.out.println("the diagonal of the matrix is printed as shown below:-");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (i == j) {
                    System.out.println(arr1[i][j]);
                }
            }
        }

    }
}
