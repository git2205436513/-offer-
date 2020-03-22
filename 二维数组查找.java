/**
 * @author FJC
 * @date 2020/3/6-10:21
 */
/**
 *在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 * **/
public class 二维数组查找 {
//    从左到右递增，从上到下递增，那么我们直接找第一行最后一个数，大于它说明就在第二行，否则在第一行
//    public boolean Find(int target, int [][] array) {
//        int row = 0;
//        int column = array[0].length - 1;
        //从后往前寻找，同时判断行列是否超过限制
//        while (row <array.length && column >= 0) {
//            int value = array[row][column];
            //大于最后一个数 说明在下一行
//            if (target > value) {
//                row++;
            // 小于最后一个数 说明在前面
//            } else if (value > target) {
//                column--;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
}

