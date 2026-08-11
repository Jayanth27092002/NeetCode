class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Boolean> map=new HashMap<> ();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];

            if(map.get(num)!=null){
                return true;
            }
            else{
                map.put(num,true);
            }

        }

        return false;

        
    }
}