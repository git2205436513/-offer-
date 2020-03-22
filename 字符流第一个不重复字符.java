import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author FJC
 * @date 2020/3/10-23:06
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 如果当前字符流没有存在出现一次的字符，返回#字符
 */
public class 字符流第一个不重复字符 {
    //一个字符对应一个值这中key/value的方式，自然想到了map,又因为强调第一个，所以使用LinkedHashMap
    private Map<Character, Integer> map = new LinkedHashMap<>();

    //Insert one char from stringstream
    public void Insert(char ch) {
        // 如果存在，就获取对应字符的值+1再写入
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 0);
        }
    }


    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        //map.entry才有for方法嗷，判断如果为一个就输出
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() == 0) {
                return set.getKey();
            }
        }
        return '#';
    }
}

