/**
 * @author FJC
 * @date 2020/3/7-16:08
 */

/**
* 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
* 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
*  但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
* */
public class 表示数值的字符串 {


    /** 方法一，直接调用Double的方法实现，该方法的作用是将字符串转化为double数
     public boolean isNumeric(char[] str) {
     try {
     double dou = Double.parseDouble(new String(str));
     } catch (NumberFormatException e) {
     return false;
     }
     return true;
     }
     **/
    /** 方法二，正则毁天灭地法
     public boolean isNumeric(char[] str) {
     String string = String.valueOf(str);
     return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
     }
     **/

    //臭弟弟假设法
    int index = 0;
    public boolean isNumeric(char[] str) {
        //你就一个空字符串，搁这儿整活呢？
        if (str.length < 1) {
            return false;
        }

        boolean flag = scanInteger(str);

        if (index < str.length && str[index] == '.') {
            index++;
            flag = scanUnsignedInteger(str) || flag;
        }

        if (index < str.length && (str[index] == 'E' || str[index] == 'e')) {
            index++;
            flag = flag && scanInteger(str);
        }

        return flag && index == str.length;

    }

    private boolean scanUnsignedInteger(char[] str) {
        int start = index;
        // 检查是否为整数
        while (index < str.length && str[index] >= '0' && str[index] <= '9') {
            index++;
        }
        return start < index; //是否存在整数
    }
    //
    private boolean scanInteger(char[] str) {
        //正负号出现在数字第一位
        if (index < str.length && (str[index] == '+' || str[index] == '-')) {
            index++;
        }
        return scanUnsignedInteger(str);

    }
}


