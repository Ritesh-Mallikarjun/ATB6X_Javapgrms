package ATB_6X_May;

public class Lab025 {
    public static void main(String[] args) {
        float[][] basicSal= new float[3][4];
        System.out.println("this program is to find the salary present in the array !!!");
        int rowValue =30;
        for (int i = 0; i < basicSal.length ; i++) {
            for (int j = 0; j < basicSal[i].length; j++) {
                basicSal[i][j]=((j+1)* rowValue);
            }
            rowValue = rowValue +10;
        }

        for (int i = 0; i < basicSal.length ; i++) {
            System.out.println("The program dispalying the values of row "+(i+1));
            for (int j = 0; j < basicSal[i].length; j++) {
                System.out.print(basicSal[i][j]+" ");
            }
            System.out.println();
        }

    }
}
