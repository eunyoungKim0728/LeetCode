class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long count =nums.length;
        int current = 1;

        for(int i =1; i < nums.length; i ++ ){
            if(nums[i] != nums[i-1]){
                current++;
                count += current - 1;
            }else{
                current = 1;
                
            }

        }

        return count;
    }
}