class Solution {
    public int[] productExceptSelf(int[] nums) {

        int count=0;
        int product1=1;
        int product2=1;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count ++;
                
            }
            else{
                product1*=nums[i];
            }

            if(count>1){
                return new int[nums.length];
            }
            product2*=nums[i];
            
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[i]=product2/nums[i];            
                }
            else{
            ans[i]=product1;
        }
        }


        return ans;
        
        
    }
}  
