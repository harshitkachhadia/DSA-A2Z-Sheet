// Problem Definition : 
// Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

// Example:
// Input: ‘N’ = 3


// Code :

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
      for(int i = 1; i <= 2*n - 1; i++) {
          int star = i;
            if( i > n) star = 2*n - i;
          for( int j = 1; j <= star; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}

// Output: 

// *
// **
// ***
// **
// *
