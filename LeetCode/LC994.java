package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chen_y
 * @date 2025-07-28 21:21
 */
public class LC994 {
    public int[][] direction=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        //新鲜的橙子计数器
        int freshOrigin=0;
        //腐烂的橙子坐标
        List<int[]> queue=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    freshOrigin++;
                }else if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
            }
        }
        int time=0;
        while(freshOrigin>0 && !queue.isEmpty()){
            int len=queue.size();
            int i=0;
            while(i<len){
                int[] cur=queue.removeFirst();
                int x=cur[0],y=cur[1];
                for(int j=0;j<4;j++){
                    int newX=x+direction[j][0];
                    int newY=y+direction[j][1];
                    if(newX>=0 && newX<m && newY>=0&&newY<n && grid[newX][newY]==1){
                        queue.addLast(new int[]{newX,newY});
                        freshOrigin--;
                        grid[newX][newY]=2;
                    }
                }
                i++;
            }
            time++;
        }
        return freshOrigin==0?time:-1;
    }

    public static void main(String[] args) {
        LC994 lc994 = new LC994();
        lc994.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}});
    }
}
