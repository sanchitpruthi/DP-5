/**
 * LeetCode Execution: No Problem (but too slow, 7.71% :-( )
 * 
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n) for then new matrix
 * 
 */


class Solution
{
    public int uniquePaths(int m, int n)
    {
        int[][] path = new int[n][m];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(i == 0 || j == 0)
                    path[i][j] = 1;
                else
                    path[i][j] = path[i - 1][j] + path[i][j - 1];	// current cell = top cell + left cell
            }
        }
        return path[n - 1][m - 1];
    }
}