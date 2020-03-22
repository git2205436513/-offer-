import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author FJC
 * @date 2020/3/6-10:56
 */

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */

public class 数组重复的数字 {
        // 数组排序求解
//    public class Solution {
//        public boolean duplicate(int numbers[], int length, int[] duplication) {
            //利用Arrays.sort方法排序 自然两个相同的数字就相邻了
//            Arrays.sort(numbers);
//            for (int i = 0; i < length - 1; i++) {
                // 相邻数字相等，那么久重复了
//                if (numbers[i] == numbers[i + 1]) {
//                    duplication[0] = numbers[i];
//                    return true;
//                }
//            }
//            return false;
//        }
//}

        // 利用hasset求解 hashset 只能储存不重复值
//    public boolean duplicate(int numbers[],int length,int [] duplication) {
        //创建hashset，注意<>是object类型 所以这里使用Integer
//        HashSet<Integer> set = new HashSet<>();
        //遍历数组
//        for (int i = 0; i < length ; i++) {
        // 如果hashset中存在相同的值，说明这是第一个重复的，则得解
//            if(set.contains(numbers[i])){
//                duplication[0] = numbers[i];
//                return  true;
        // 没有重复 则加入set中
//            }else{
//                set.add(numbers[i]);
//            }
//
//        }
        // 遍历所有仍没得到重复，故返回false
//        return false;
//   }


        //双for循环求解
//    public boolean duplicate(int numbers[],int length,int [] duplication) {
//        for (int i = 0; i < length; i++) {
//            for (int j = i+1; j < length; j++) {
//                if (numbers[i] == numbers[j]){
//                    duplication[0] = numbers[i];
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


}
