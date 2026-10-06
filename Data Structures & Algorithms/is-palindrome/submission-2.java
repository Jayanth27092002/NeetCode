class Solution {
    public boolean isPalindrome(String s) {
        char[] ans=s.toCharArray();

        int first=0;
        int last=ans.length-1;

        while(first<last){
           

            while(!(('0'<=ans[first] && '9'>=ans[first]) || ('a'<=ans[first] && 'z'>=ans[first]) || ('A'<=ans[first] && 'Z'>=ans[first])) && last>first){
                first++;
            }
            while(!(('0'<=ans[last] && '9'>=ans[last]) || ('a'<=ans[last] && 'z'>=ans[last]) || ('A'<=ans[last] && 'Z'>=ans[last])) && last>first){
                last--;
            }


            if( last>first && Character.toLowerCase(ans[last])!=Character.toLowerCase(ans[first])){
                return false;
            }

            last--;
            first++;

        }


    return true;  
    }
}
