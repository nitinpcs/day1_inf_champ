class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int c=1;
        int pos = points[0][1];
        for(int i=1; i<points.length; i++){
            if(points[i][0] <= pos){
                continue;
            }
            c++;
            pos = points[i][1];
        }     
        return c; 
    }
}
