// Problem Definition :
// Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.
// Example:
// Input: ‘N’ = 3

// Code : 

public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
                            int num = 1;
            for(int j = 0; j < n - i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}


// Output: 

// 1 2 3
// 1 2
// 1
