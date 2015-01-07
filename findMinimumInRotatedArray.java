 public class Solution {
    public int findMin(int[] num) {
        int smallest = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] < smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }
}