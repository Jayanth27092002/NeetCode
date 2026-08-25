class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);

        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            pq.offer(new int[]{entry.getKey(), entry.getValue()});

            // Keep only K elements
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }

        return result;

        
        
    }
}
