import java.util.*;
public class L1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int size = grid.length*grid[0].length;
        Integer [] arr = new Integer [size];
        
        for(int i=0;i<size;i++){
            int inc = (k + i) % size;
            int row = i / grid[0].length;
            int col = i % grid[0].length;
            arr[inc] = grid[row][col];
        }
        List<Integer> list = Arrays.asList(arr);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int j = 0; j<grid.length; j++){
            int start = j * grid[0].length;
            int end = start + grid[0].length;
            List<Integer> sublist = list.subList(start,end);
            ans.add(sublist);
        }
        
        return ans;
    }
}
