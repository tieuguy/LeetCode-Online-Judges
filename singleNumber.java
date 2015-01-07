import java.util.Hashtable;

public class Solution {
	public static int singleNumber(int[] A) {
        int ctr = 0;
        
        // Create a hash table to store unique numbers
        Hashtable<Integer, Integer> allNum = new Hashtable<Integer, Integer>();
        
        for(ctr = 0; ctr < A.length; ctr++){
            if(allNum.containsKey(A[ctr])){
                // if contains, set key value to 2
                allNum.put(A[ctr], 2);
            }else{
                // if does not contain, set key value to 1
                allNum.put(A[ctr], 1);
            }
        }
        
        ctr = 0;
        while(ctr < A.length){
            if((Integer)allNum.get(A[ctr]) == 1){
                return A[ctr];
            }
            ctr++;
        }
        return -1;
    }
    //public static void main(String args[]) {
    //	int[] A = new int[] {1,1,2,2,3,4,5,5,3};
    //	System.out.println("Single number: " + SingleNumberSolution.singleNumber(A));
    //}
}