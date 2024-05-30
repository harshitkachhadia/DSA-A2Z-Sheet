public class Solution {
    public static void nTriangle(int n) {
     int num = 1;
     for(int i = 0; i < n; i++) {
         for(int j = 0; j <= i; j++) {
             System.out.print(num+ " ");
         }
             num++;
             System.out.println();
     }
 
    }
}

// output : 
// 1
// 2 2 
// 3 3 3
