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
