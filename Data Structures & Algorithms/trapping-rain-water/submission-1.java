class Solution {
    public int trap(int[] height) {
        int[] rightMax=new int[height.length];

        int[] leftMax=new int[height.length];

        int n=height.length;
        rightMax[n-1]=height[n-1];
        leftMax[0]=height[0];
       

        for(int i=1;i<n;i++){
            rightMax[n-i-1]=Math.max(height[n-i-1],rightMax[n-i]);
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int answer=0;

        for(int i=1;i<n-1;i++){
            int leftMaxi=leftMax[i];
            int rightMaxi=rightMax[i];
            answer+=Math.min(leftMaxi,rightMaxi)-height[i];
            
        }

        return answer;



    }
}
