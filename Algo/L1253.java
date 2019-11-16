import java.util.*; 
class L1253 {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>>  ans = new ArrayList<List<Integer>>();
        int len = colsum.length;
        Integer [] upperArr = new Integer [len];
        Integer [] lowerArr = new Integer [len];
        
        int upperSum=0;
        int lowerSum=0;
        
        for(int i =0; i<colsum.length; i++){
            if(colsum[i]==0){
                upperArr[i] = 0;
            }else{
                upperArr[i] = 1;
                upperSum +=1;
            }
        }
        
        for(int j=0; j<colsum.length; j++){
            if(colsum[j]==2){
                lowerArr[j] = 1;
                lowerSum+=1;
            }else if(colsum[j]==1 && upperSum>upper){
                upperArr[j]=0;
                lowerArr[j]=1;
                lowerSum += 1;
                upperSum -=1;
            }else{
                lowerArr[j]=0;
            }
        }
        if(lowerSum==lower && upperSum==upper){
            List<Integer> upperList = Arrays.asList(upperArr);
            List<Integer> lowerList = Arrays.asList(lowerArr);
            ans.add(upperList);
            ans.add(lowerList);
        }

        
        return ans;
    }
}