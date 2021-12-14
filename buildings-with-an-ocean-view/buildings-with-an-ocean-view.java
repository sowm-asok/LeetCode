class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> result = new ArrayList<>();
        int len = heights.length-1;
        int maxHeight = heights[len];
        result.add(len);
        len--;
        while(len >= 0){
            if(maxHeight < heights[len]){
                result.add(len);
                maxHeight = heights[len];
            }
            len--;
        }
        int [] output = new int[result.size()];
        int index=0;
        for( int i=result.size()-1;i>=0;i--){
            output[index++] = result.get(i);
        }
        return output;
    }
}