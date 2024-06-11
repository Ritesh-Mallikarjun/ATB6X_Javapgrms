package ATB_6X_May;

import java.util.Arrays;

public class Lab043 {
    public static void main(String[] args) {
        System.out.println("this program is to find the anagram present in the string array");
        String[] array= {"eat", "tea", "tan", "ate", "nat", "bat"};

        int[] visited= new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            if(visited[i]!=1){
                System.out.print("Anagram : "+array[i]);
                for (int j = i+1; j < array.length; j++) {
                    if (visited[j] != 1 && isanagram(array[i], array[j])) {
                        System.out.print(", "+array[j]);
                        visited[j]=1;
                    }
                }
                visited[i]=1;
                System.out.println();
            }

        }
    }

    public static boolean isanagram(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
