class Solution {
    public int maxArea(int[] heights) {


        int maxi=-1;

        int first=0;
        int last=heights.length-1;

        while(last>first){
            int water=(last-first)*Math.min(heights[last],heights[first]);
            maxi=Math.max(water,maxi);
            if(heights[first]<=heights[last]){
                first++;

            }
            else{
                last--;
            }
        }

       
        return maxi;
        
    }
}
