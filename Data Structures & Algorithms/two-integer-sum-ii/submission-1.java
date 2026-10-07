class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int first =0;
        int last=numbers.length-1;

        while(last>first){
            int num1=numbers[first];
            int num2=numbers[last];
            if(num1+num2>target){
                last--;
            }
            else if(num1+num2<target){
                first ++;
            }
            else{
                break;
            }
        }

        return new int[]{first+1,last+1};
    
    }
}
