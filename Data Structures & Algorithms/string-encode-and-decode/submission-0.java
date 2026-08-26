class Solution {

    public String encode(List<String> strs) {
         StringBuilder encoded = new StringBuilder();

         for(String s:strs){
            encoded.append(s.length());
            encoded.append('#');
            encoded.append(s);
         }

        return encoded.toString();

    }

    public List<String> decode(String str) {

 List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find '#'
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Get length
            int length = Integer.parseInt(
                str.substring(i, j)
            );

            // Move after '#'
            i = j + 1;

            // Extract the actual string
            String s = str.substring(i, i + length);

            result.add(s);

            // Move to next encoded string
            i = i + length;
        }

        return result;
      


    }
}
