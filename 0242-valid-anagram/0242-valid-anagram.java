class Solution {
    public boolean isAnagram(String s, String t) {

        char[] stringS = s.toCharArray();
        Arrays.sort(stringS);
        
        char[] stringT = t.toCharArray();
        Arrays.sort(stringT);
    
        if(stringS.length != stringT.length){
            return false;
        }else{
            for(int i =0; i < stringS.length; i++){
            
            if(stringS[i] == stringT[i]){
                continue;
            }else if(stringS[i] != stringT[i]){
                return false;
            }
        }
        return true;
        }

    }
}
