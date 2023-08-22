package com.mansoor.java.killer_java.corejava.strings;

public class PalindromesInArray {
    // Function to check if given String
    // is Palindrome or not
    static boolean isPalindrome(String str)
    {

        // Start from leftmost and rightmost corners of str
        int l = 0;
        int h = str.length() - 1;

        // Keep comparing characters while they are same
        while (h > l)
        {
            if (str.charAt(l++) != str.charAt(h--))
            {
                return false;
            }
        }
        return true;
    }

    // Function to return all Palindrome String
    static int PalindromicStrings(String []arr,
                                  int N)
    {

        int ans = 0;

        // Loop to find palindrome String
        for (int i = 0; i < N; i++) {

            // Checking if given String is
            // palindrome or not
            if (isPalindrome(arr[i])) {

                // Update answer variable
                ans++;
            }
        }
        return ans;
    }

    // Driver Code
    public static void main(String[] args)
    {

        String []arr
                = { "abc", "car", "ada", "racecar", "cool" ,"mam"};
        int N = arr.length;

        System.out.print(PalindromicStrings(arr, N));

    }
}
