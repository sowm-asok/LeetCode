class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        // Arrays.toString(intervals);
        int[][] result = new int[intervals.length][intervals[0].length];
        int index = 1;
        result[0] = intervals[0];
        for(int i = 1; i < intervals.length; i++) { 
            // check for merge [[1,3],[2,6]]-> if true, check for engulf example:[[8,12],[9,10]]
            if(result[index-1][1] >= intervals[i][0]) {
                if(result[index-1][1] <= intervals[i][1]) {
                    result[index-1][1] = intervals[i][1];
                }
            }
            
            // check for disjoint -> [[2,6],[8,10]]
            else if(! (result[index-1][1] >= intervals[i][0])) {
                result[index][0] = intervals[i][0];
                result[index][1] = intervals[i][1];
                index++;
            }
        }
        
        return Arrays.copyOfRange(result, 0, index);
    }
}