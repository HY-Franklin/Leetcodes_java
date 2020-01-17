class Solution200 {
    public int numIslands() {
        char[][] grid={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        if (grid.length==0) return 0;
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]=='1') res+=1;
                dfs(grid,i,j,m,n);
            }
        }
        return res;
    }
//dfs
    private void dfs(char[][] grid,int x,int y,int m,int n){
        if (x<0||y<0||x>=m||y>=n||grid[x][y]=='0') return;
        grid[x][y]='0';
        dfs(grid,x+1,y,m,n);
        dfs(grid,x-1,y,m,n);
        dfs(grid,x,y+1,m,n);
        dfs(grid,x,y-1,m,n);
    }
}



public class Search_pc {
}
