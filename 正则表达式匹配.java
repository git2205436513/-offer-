/**
 * @author FJC
 * @date 2020/3/7-9:05
 */

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class 正则表达式匹配 {
    /**
     * //直接使用库函数
    public boolean match(char[] str, char[] pattern) {
       return new  String(str).matches(new String(pattern));
    }**/


    // 使用标准答案 哭哭
    public boolean match(char[] str, char[] pattern) {
        // 两个字符串都空了 也没啥好比较的了
        if(str == null || pattern == null) {
            return false;
        }
        return matchs(str, 0, pattern, 0);
    }

    public boolean matchs(char[] str, int i, char[] pattern, int j) {
        //i，j都遍历完了又没返回false，那它们就是匹配的.
        if (j == pattern.length){
            return str.length == i;
        }
        // 判断当前是否匹配,这里不能不匹配就返回false，因为pattern第二个字符可能为*
       boolean first_blood = (i != str.length)&&(str[i] == pattern[j]||pattern[j] == '.');
       //判断第二个字符是否为*
       if(pattern[j+1] == '*' && j< pattern.length - 1){
           //情况一 a 与 b* b出现零次，a继续需要与*之后的字符匹配，即这里的j+2
           //情况二 a 与 a* a可以出现任意次 则a*仍可以匹配aa的情况 即这里的i+1，当然这是在first_blood为真的情况
           return  matchs(str, i, pattern, j + 2) ||
                   (first_blood && matchs(str, i + 1, pattern, j));
       }else{
           //不为* 那我们需要将first_blood和后续字符的匹配情况与一下返回。
           return first_blood && matchs(str,i+1,pattern,j+1);
       }

    }


}

