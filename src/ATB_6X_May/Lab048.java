package ATB_6X_May;

public class Lab048 {
    public static void main(String[] args) {
        System.out.println("This program is to multiply 2 matrix and fetch the result!!!");
        double[][] array1={{23.2,53.2,54.2},
                {12.35,25.56,45.56},
                {45.56,48.56,74.56}
        };
        double[][] array2={{2.2,1.2,3.2},{4.5,8.5,6.5},{8.6,7.12,8.8}};
        double[][] array3=new double[3][3];

        //multiplication of 2 matrix matrix 1 and matrix 2
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array3[i][j]=array1[i][j]*array2[i][j];
            }
        }

        //display of matrix 3
        for (int i = 0; i <array3.length ; i++) {
            for (int j = 0; j <array3[i].length ; j++) {
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }


    }
}
