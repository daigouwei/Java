package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/8.
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (null == head) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur1 = dummyHead.next;
        ListNode cur2 = null;
        while (null != cur1 && null != cur1.next) {
            cur2 = cur1.next;
            ListNode tmp = cur2.next;
            cur2.next = cur1;
            cur1.next = tmp;
            pre.next = cur2;
            pre = cur1;
            cur1 = tmp;
        }
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
