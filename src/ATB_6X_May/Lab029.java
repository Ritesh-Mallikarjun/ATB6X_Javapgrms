package ATB_6X_May;

public class Lab029 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("the even values present in the array are :- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2==0){
                    System.out.println(arr[i][j]);
                }
            }
        }

        System.out.println("-----------------------------");
        System.out.println("the odd values present in the array are:-");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2!=0){
                    System.out.println(arr[i][j]);
                }

            }

        }

    }
}
