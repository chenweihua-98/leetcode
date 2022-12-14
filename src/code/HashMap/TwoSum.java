package code.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：leetcodeDemo
 * 类 名 称：TwoSum
 * 类 描 述：TODO 力扣第一题 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 创建时间：2022/10/28 上午9:36
 * 创 建 人：chenweihua
 */
public class TwoSum {

    public int[] twoSum(int[] nums ,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }


}
