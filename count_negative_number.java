// Brute Force TC: O(n*n) SC: O(1)
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0)
                count++;
            }
        }
        return count;
    }
}
//Optimised TC: O(n+m) SC: O(1)
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int row=0;
        int col=grid[0].length-1;
        while(row<grid.length && col>=0){
            if(grid[row][col]>=0){
                row++;
            }
            else{
                count+=grid.length-row;
                col--;
            }
        }
        return count;
    }
}
