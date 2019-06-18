给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
注意：答案中不可以包含重复的三元组。

例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};
        System.out.println(threeSum(nums));
    }
        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) break;
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int j = nums.length - 1;
                int target = 0 - nums[i];
                int k = i + 1;
                while (k < j) {
                    if (nums[k] + nums[j] == target) {
                        List<Integer> item = Arrays.asList(nums[i], nums[k], nums[j]);
                        result.add(item);
                        while (k < j && nums[k] == nums[k + 1]) k++;
                        while (k < j && nums[j] == nums[j - 1]) j--;
                        k++;j--;
                    } else if (nums[k] + nums[j] < target) {
                        k++;
                    } else {
                        j--;
                    }
                }
            }
            return result;
        }
    }
