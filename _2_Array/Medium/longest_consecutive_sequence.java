class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        // to represent longest consecutive sequence
        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        
        for(int item : set) {
            if(!set.contains(item-1)){
                int count = 1;
                int x = item;
                while(set.contains(x+1)){
                    count ++;
                    x++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;

    }
}
