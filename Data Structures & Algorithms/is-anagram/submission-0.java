class Solution {
    public boolean isAnagram(String s, String t) {

        int[] array=new int[26];
       
       for (char ch:s.toCharArray()){
        array[ch-'a']++;
       }

       for(char ch:t.toCharArray()){
        array[ch-'a']--;
       }

       for(int i:array){
        if(i!=0)return false;
       }


       return true;

    }
}
