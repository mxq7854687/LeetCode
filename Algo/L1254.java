
public class L1254 {
	    public int closedIsland(int[][] grid) {
	        
	        for(int i=0; i<grid.length;i++){
	            for(int j=0; j<grid[0].length; j++){
	                //fill start from border
	                if(i * j * (i-grid.length+1) * (j-grid[0].length+1) ==0){
	                   fill(grid,i,j);
	                }
	            }
	        }
	        
	        int result =0;
	        for(int p =0; p<grid.length;p++){
	            for(int q=0; q<grid[0].length; q++){
	                result+= fill(grid,p,q)>0?1:0;
	            }
	        }
	        return result;
	    }
	    public int fill(int[][]g , int r, int c){
	        if(r<0 || c<0 || r>=g.length || c>=g[0].length || g[r][c]!=0){
	            return 0;

	        }
	        return (g[r][c]=1)+fill(g,r+1,c)+fill(g,r-1,c)+fill(g,r,c-1)+fill(g,r,c+1);
	    }

}
