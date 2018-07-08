package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/8.
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode res = dummyHead;
        ListNode cur = head;
        while (null != cur && null != cur.next) {
            if (cur.next.val != cur.val) {
                res.next = cur;
                res = res.next;
            }
            cur = cur.next;
        }
        res.next = cur;
        return dummyHead.next;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
