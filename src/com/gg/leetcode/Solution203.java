package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/22.
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (null == head)
            return null;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;
        while (null != cur) {
            if (val == cur.val) {
                pre.next = cur.next;
            }
            else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummyHead.next;
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
