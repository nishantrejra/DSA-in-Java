class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int rem = nums[i]%3;
            if(rem == 1 || rem == 2){
                count++;
            }
        }
        return count;
        
    }
}