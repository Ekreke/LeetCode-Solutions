package twoSum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Richard
 * @Date: 2024/07/10/11:59
 * @Description:
 */

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        // init ans array
        int[] ans = new int[]{0,1};
        // init map
        HashMap<Object, Object> map = new HashMap<>();

        // for each nums
        for (int i = 0; i <nums.length -1 ; i++) {


            // put nums[i] as key and i  as value to map
            nums[i] = target - nums[i];

            map.put(nums[i],i);

            if (map.containsKey(nums[i + 1] )){
                return new int[]{(int) map.get(nums[i + 1]),i + 1};
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ints = {3, 2, 3};
        int[] ints1 = twoSum(ints, 6);
        System.out.println(Arrays.toString(ints1));
    }
}
