class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)) {
                ans[0] = map.get(rem);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
       }
       return ans; 
    }
}
