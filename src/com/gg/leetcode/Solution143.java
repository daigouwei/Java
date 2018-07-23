package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/23.
 */
public class Solution143 {
    public void reorderList(ListNode head) {
        if (null == head || null == head.next)
            return;
        //寻找中间节点
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast && null != fast.next && null != fast.next.next) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode headNew = slow.next;
        slow.next = null;
        //反转链表
        ListNode pre = null;
        ListNode cur = headNew;
        while (null != cur) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        //合并链表
        ListNode cur1 = head;
        ListNode cur2 = pre;
        while (null != cur2) {
            ListNode tmp1 = cur1.next;
            ListNode tmp2 = cur2.next;
            cur1.next = cur2;
            cur2.next = tmp1;
            cur1 = tmp1;
            cur2 = tmp2;
        }
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
