package ATB_6X_May;

import java.util.Arrays;

public class Lab042 {
    public static void main(String[] args) {
        System.out.println("This program is to find the anagrams present in the string array!!");
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Array to keep track of whether a string has been visited or not
        boolean[] visited = new boolean[str.length];

        // Find and print anagrams
        for (int i = 0; i < str.length; i++) {
            if (!visited[i]) //(!visited[i] is nothing but !false=true
            {
                System.out.print("Anagrams: " + str[i]);
                for (int j = i + 1; j < str.length; j++) {
                    if (!visited[j] && areAnagrams(str[i], str[j])) {
                        System.out.print(", " + str[j]);
                        visited[j] = true;
                    }
                }
                visited[i] = true;
                System.out.println();
            }

        }
    }

        private static boolean areAnagrams(String str1, String str2) {
            if (str1.length() != str2.length())
                return false;
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }


}


