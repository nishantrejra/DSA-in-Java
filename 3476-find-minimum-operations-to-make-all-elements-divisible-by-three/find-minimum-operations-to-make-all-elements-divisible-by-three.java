class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 3 == 0){
                continue;
            }else if (nums[i] % 3 == 1){
                nums[i] -=1;
                count++;
            }else{
                nums[i] += 1;
                count++;
            }
        }
        return count;
        
    }
}