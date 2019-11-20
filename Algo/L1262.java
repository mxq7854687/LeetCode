
public class L1262 {
    public int maxSumDivThree(int[] nums) {
        int[] arr = new int[3];
        arr[1] = arr[2] = Integer.MIN_VALUE;
        for(int x : nums) {
            int[] arrNext = new int[3];
            arrNext[0] = Math.max(arr[x%3] + x, arr[0]);
            arrNext[1] = Math.max(arr[(x+1)%3] + x, arr[1]);
            arrNext[2] = Math.max(arr[(x+2)%3] + x, arr[2]);
            arr = arrNext;
            System.out.println(arrNext[0]+" "+arrNext[1]+" "+arrNext[2]);
        }
        return arr[0];
        
    }
}
