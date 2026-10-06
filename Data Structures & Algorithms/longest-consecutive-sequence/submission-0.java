class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
        return 0;
        }

        
        Arrays.sort(nums);

        int length=1;
        int maxLength=-1;

        for(int i=1;i<nums.length;i++){
            int val=nums[i]-nums[i-1];
            if(val==0) continue;
            if(val==1){
                length++;
                continue;
            } 
            if(val>=1){
                maxLength=Math.max(maxLength,length);
                length=1;
            } 

        }

        return Math.max(maxLength,length);
        
    }
}
