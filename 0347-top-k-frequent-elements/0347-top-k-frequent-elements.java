class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;

        for (int key : nums) {    
            
            if (!map.containsKey(key)) { 
                count = 1;
                map.put(key, count); 
            }else{
                int checkValue = map.get(key);
                count = checkValue;
                count++;
                map.put(key, count);
            }
            count =1;
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        Object[] objArray = keySet.toArray();

        int[] intArray = new int[k];
        for (int i = 0; i <  k; i++) {
            intArray[i] = (Integer) objArray[i];
        }

        return intArray;
    }
}
