/**
 * @author FJC
 * @date 2020/3/20-17:51
 */
/**
 * 给一个链表，若其中包含环，
 * 请找出该链表的环的入口结点，
 * 否则，输出null。
 * **/
public class 链表中环的入口节点 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        //判断是否有环
        if(pHead == null){
            return null;
        }
        ListNode i = pHead;
        ListNode j = pHead;
        boolean flag = false;
        while(j != null && j.next != null){
            // j始终比i多走一个 如果存在环，必定会相遇
            i = i.next;
            j = j.next.next;
            if(i == j){
                flag = true;
                break;
            }
        }
        // 如果i\j没有相遇 报错
        if(!flag){
            return null;
        }
        //判断环中有几个节点
        int num = 1;
        j = j.next;
        while (i != j) {
            j = j.next;
            ++num;
        }
        //找到环的入口
        i = j = pHead;
        for (int k = 0; k < num; k++) {
            j = j.next;
        }

        while (i != j){
            i = i.next;
            j = j.next;
        }
             return i;
        }

    }

