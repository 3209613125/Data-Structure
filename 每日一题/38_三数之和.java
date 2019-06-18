package www.bittech;
//给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
//注意：答案中不可以包含重复的三元组。
//
//例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {6,-1, 0, 1, 2, -1, 4};
        System.out.println(threeSum(nums));
    }
    //三数之和
//6,-1, 0, 1, 2, -1, 4
//1.先将数字按从大到小的顺序排列
//因为题目中要求三数之和为0，所以第一个数字子必定不能为大于0的数字，否则直接退出，并返回结果为空
//然后设置两个指针，i和j，i从前往后，j从后往前遍历数组，假设第一个数即为我们要找的三数中的一个
//那么另外两个数字之和必然为target=0-nums[i]，int k = i+1，如果 k<j，说明k和j指针还没有相遇
//如果k+j等于target值的话，则将其三个数组元素转变为list集合保存起来
    public static List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> lists = new ArrayList<>();
    Arrays.sort(nums);
    for( int i = 0;i<nums.length;i++) {
        if (nums[i] > 0) {
            break;
        }
        if(i > 0 && nums[i] == nums[i-1]){
            continue;
        }
        int j = nums.length - 1;
        int target = 0 - nums[i];
        int k = i + 1;
        while (k < j) {
            if (nums[k] + nums[j] == target) {
                List<Integer> item = Arrays.asList(nums[i], nums[k], nums[j]);
                lists.add(item);
                while (k < j && nums[k] == nums[k + 1]) {
                    k++;
                }
                while (k < j && nums[j] == nums[j - 1]) {
                    j--;
                }
                k++;
                j--;
            } else if (nums[k] + nums[j] < target) {
                k++;
            } else {
                j--;
            }
        }
    }
        return lists;

    }
}
