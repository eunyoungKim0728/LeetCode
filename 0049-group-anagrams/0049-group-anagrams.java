class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        String sortString;

        for (String value : strs) {
            char[] charArr = value.toCharArray();  
            Arrays.sort(charArr);  
            sortString = new String(charArr);  
            
            if (!map.containsKey(sortString)) { 
                map.put(sortString, new ArrayList<>());  
            }
            
            map.get(sortString).add(value);  
        }

        List<List<String>> result = new ArrayList<>(map.values());
        
        result.sort(Comparator.comparingInt(List::size)); 

        return result; 

    }
}
