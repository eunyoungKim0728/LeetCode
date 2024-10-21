class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] firstMultiple = new int[length];
        int[] secondMiltiple = new int[length];
        int[] result = new int[length];
        int resultLeft = 1;
        int resultRight = 1;

        for(int i = 0; i < nums.length; i++){
            
            firstMultiple[i] = resultLeft;
            resultLeft *= nums[i];
        }

        for (int j = length - 1; j >= 0; j--){
            secondMiltiple[j] = resultRight;
            resultRight *= nums[j];
        }

        for(int z = 0; z < nums.length; z++){
            result[z] = firstMultiple[z] * secondMiltiple[z];
        }

        return result;
    }
}  
