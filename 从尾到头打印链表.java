import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

 /**
 * @author FJC
 * @date 2020/3/10-23:18
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class 从尾到头打印链表 {
    // 链表只能从前到后，但是要从后输出，先进后出，栈

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp = listNode;
//        while(tmp!=null){
//            list.add(0,tmp.val);
//            tmp = tmp.next;
//        }
        // 第二种就是递归实现了
        if(tmp != null){
            list.add(tmp.val);
            printListFromTailToHead(tmp.next);
        }
        return list;
    }
}
