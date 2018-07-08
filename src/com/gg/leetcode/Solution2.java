package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/8.
 */
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1 || null == l2) {
            return null;
        }
        int carry = 0;
        ListNode dummyHeadNode = new ListNode(0);
        ListNode preNode = dummyHeadNode;
        ListNode curNode = null;
        while (null != l1 || null != l2) {
            int val = null != l1 && null != l2 ? l1.val + l2.val + carry : null != l1 ? l1.val + carry : l2.val + carry;
            carry = val > 9 ? 1 : 0;
            val = val % 10;
            curNode = new ListNode(val);
            preNode.next = curNode;
            preNode = curNode;
            l1 = null != l1 ? l1.next : null;
            l2 = null != l2 ? l2.next : null;
        }
        if (1 == carry) {
            curNode = new ListNode(1);
            preNode.next = curNode;
        }
        return dummyHeadNode.next;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
