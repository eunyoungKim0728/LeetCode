class Solution {
    public int sumFourDivisors(int[] nums) {
         ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for(int i =0; i < nums.length; i++){
            arr.clear();
            int sqrt = (int) Math.sqrt(nums[i]);
            for(int j =1; j <= sqrt; j++){
                if(nums[i] % j == 0){ 
                    arr.add(j);
                        if(nums[i] / j != j){
                            arr.add(nums[i] / j);
                        }
                    }
            }
            if(arr.size() == 4){
                for (int num : arr) {
                    sum += num;
                }
                
            }else{
                continue;
            }
        }

        return sum;
    }
}