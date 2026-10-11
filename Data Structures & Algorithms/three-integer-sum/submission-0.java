class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
           
            if(i!=0 && nums[i]==nums[i-1] ){
                continue;
            }
            int num1=nums[i];

            int first=i+1;
            int last=nums.length-1;

            while(last>first){
                int num2=nums[first];
                int num3=nums[last];

                int  sum=num1+num2+num3;
                if(sum==0){
                    answer.add(Arrays.asList(nums[i],nums[first],nums[last]));
                    first++;
                    last--;

                    while(nums[first]==nums[first-1] && first<last){
                        first++;
                    }

                    while(nums[last]==nums[last+1] && first<last){
                        last--;
                    }





                }
                else if(sum>0){
                    last--;
                }
                else{
                    first++;
                }

            }
        }

        return answer;


       
}
}
