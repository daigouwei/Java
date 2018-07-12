package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/12.
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (null == head || null == head.next || null == head.next.next)
            return false;
        ListNode node1 = head;
        ListNode node2 = head;
        while (null != node1 && null != node2 && null != node2.next) {
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2)
                return true;
        }
        return false;
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
