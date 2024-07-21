// Problem Definition :
// Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.
// Example:
// Input: ‘N’ = 3



// Code :

public class Solution {
   static void erectPyramid(int n) {
       for ( int i = 0; i < n; i++) {
           for(int j = 0; j < n - i - 1; j++) {
               System.out.print(" ");
           }
                      for(int j = 0; j < 2*i + 1; j++) {
                              System.out.print("*");

           }
                      for(int j = 0; j < n - i - 1; j++) {
                              System.out.print(" ");

           }
           System.out.println();
       }
   }
    static void invertedPyramid(int n) {
       for ( int i = 0; i < n; i++) {
           for(int j = 0; j < i; j++) {
               System.out.print(" ");
           }
                      for(int j = 0; j < 2*n - (2*i + 1); j++) {
                              System.out.print("*");

           }
                      for(int j = 0; j < i; j++) {
                              System.out.print(" ");

           }
                      System.out.println();

       }
   }
    public static void nStarDiamond(int n) {
        erectPyramid(n);
        invertedPyramid(n);  
    }
}


// Output: 

//   *
//  ***
// *****
// *****
//  ***
//   *
