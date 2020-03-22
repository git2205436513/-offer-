/**
 * @author FJC
 * @date 2020/3/20-19:00
 */

import java.util.List;

/**
 * 在一个排序的链表中，存在重复的结点，
 * 请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5
 * 处理后为 1->2->5
 */
public class 删除链表中重复的节点
{
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null){
            return  pHead;
        }
        // 构造一个辅助头节点 防止第一个就是重复的情况
        ListNode head = new ListNode(0);
        head.next = pHead;

        ListNode pre = head;
        ListNode cur = head.next;

        while (cur != null){
            // 如果cur与cur的后一个节点相等，则移动cur节点直到不重复
            if(cur.next != null && cur.next.val == cur.val) {
                while (cur.next != null && cur.next.val == cur.val) {
                    cur = cur.next;
                }

                cur = cur.next;

                pre.next = cur;
            }else{
                // 不相等就继续往下走
                pre = cur;
                cur = cur.next;
            }
        }
        return head.next;
    }
}
