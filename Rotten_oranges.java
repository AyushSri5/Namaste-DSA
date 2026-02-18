// Optimised approach BFS TC: O(n) SC: O(M*N)
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> curr=new LinkedList<>();
        Queue<Pair> next=new LinkedList<>();
        int fresh=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    curr.add(new Pair(i,j));
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        int c=0;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        
        while(!curr.isEmpty()){
            Pair p=curr.poll();
            
            
           for(int i=0;i<4;i++){
                int nx=dr[i]+p.x;
                int ny=dc[i]+p.y;
                if(nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length && grid[nx][ny]==1){
                    c++;
                    grid[nx][ny]=2;
                    next.add(new Pair(nx,ny));
                }
           }
           if(curr.isEmpty()){
            if(!next.isEmpty())
            time++;
            curr=next;
            next=new LinkedList<>();
           }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return  time;
    }
}
class Pair{
    int x;
    int y;

    public Pair(int a,int b){
        x=a;
        y=b;
    }
}
