import java.util.Arrays;
public class MInTOBurstBalloon {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 1;
        int Pos = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > Pos) {
                res++;
                Pos = points[i][1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        MInTOBurstBalloon solution = new MInTOBurstBalloon();
        int[][] points = {{10,16}, {2,8}, {1,6}, {7,12}};
        System.out.println(solution.findMinArrowShots(points)); // Output: 2
    }
}

