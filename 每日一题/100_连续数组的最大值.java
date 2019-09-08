import java.util.*;
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int l = array.length;
        int cur = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < l;i++){
            if(cur <= 0){
                cur = array[i];
            }
            else {
                cur += array[i];
            }
            if(cur > max){
                max = cur;
            }
        }
        return max;
    }
}
