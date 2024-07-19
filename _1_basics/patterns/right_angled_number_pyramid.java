// Problem Definition : 
// Sam is making a Triangular painting for a maths project.

// An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.

// For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.

// Example:
// Input: ‘N’ = 3

// Code :    

public class Solution {
    public static void nTriangle(int n) {
        for(int i = 0; i < n; i++){
                int num = 1;
            for(int j = 0; j <= i; j++){
            System.out.print(num + " ");
            num++;
        }
            System.out.println();

        }
    }
}


// Output: 
// 1
// 1 2 
// 1 2 3

