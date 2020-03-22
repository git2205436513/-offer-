/**
 * @author FJC
 * @date 2020/3/6-11:37
 */

import sun.security.util.Length;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 */
public class 构建成绩数组 {

    /**B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
     * 规定B[0] = A[1] * A[2] * ... * A[n-1] 设此时的A[0] = 1
     * B[1] = A[0]*A[2]*...*A[n-] 设此时的A[1] = 1
     * 以此类推,得到附带图
     * 我们先计算下三角再计算上三三角
     *
     */
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if (A.length != 0) {
            B[0] = 1;
            //计算上三角
            for (int i = 1; i < A.length; i++) {
                B[i] = B[i-1]*A[i-1];
            }
            //计算下三角
            int temp = 1;
            for (int i = A.length-2; i >=0 ; i++) {
                temp*=A[i+1];
                B[i]*=temp;
            }
        }
        return B;
    }
}
