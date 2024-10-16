
//Boyer-Moore Voting Algorithm
//The majority element is defined as the element that appears
// 
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;

        for(int i = 0; i < n; i++) {
            if(count == 0) {
                element = nums[i];
                count++;
            }else if(nums[i]==element) count++;
            else count--;
        }
        return element;
    }
}
// The idea is based on the fact that if there is a majority element, 
// it will eventually dominate and remain as the candidate after going through the entire array.
