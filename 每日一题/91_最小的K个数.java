链接：https://www.nowcoder.com/questionTerminal/6a296eb82cf844ca8539b57c23e6e9bf?toCommentId=3479870
来源：牛客网

import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
                Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList();
        if (input.length >= k) {
            for(int i = 0;i < k;i++){
                list.add(input[i]);
            }
        }
//        else {
//            for(int i = 0;i < input.length;i++){
//                list.add(input[i]);
//            }
//        }
        return list;
    }
}
