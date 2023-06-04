import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findCircleNumTest1() {
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        int output = 2;
        Assert.assertEquals(output, new Solution().findCircleNum(isConnected));
    }


    @Test
    public void findCircleNumTest2() {
        int[][] isConnected = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        int output = 3;
        Assert.assertEquals(output, new Solution().findCircleNum(isConnected));
    }
    //[[1,0,0,1],[0,1,1,0],[0,1,1,1],[1,0,1,1]]
    @Test
    public void findCircleNumTest23() {
        int[][] isConnected = {
                {1,0,0,1},
                {0,1,1,0},
                {0,1,1,1},
                {1,0,1,1}
        };
        int output = 1;
        Assert.assertEquals(output, new Solution().findCircleNum(isConnected));
    }
}
