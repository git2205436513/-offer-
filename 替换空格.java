/**
 * @author FJC
 * @date 2020/3/7-8:49
 */

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class 替换空格 {

    //使用自带函数replace
   /** public String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }**/

    //使用一个新的StringBuffer数组来进行操作，这里也可使使用StringBuilder，性能会有10%~15%的提升
   //   不过这样多线程不安全
   /**public String replaceSpace(StringBuffer str){
       StringBuffer str1 = new StringBuffer();
       for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == ' '){
               str1.append("%20");
           }else{
               str1.append(str.charAt(i));
           }
       }
    return  str1.toString();
   }
    **/
}
