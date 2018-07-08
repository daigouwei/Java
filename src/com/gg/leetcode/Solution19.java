package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/8.
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head) {
            return null;
        }
        ListNode dummyHeadNode = new ListNode(0);
        dummyHeadNode.next = head;
        ListNode node1 = dummyHeadNode;
        ListNode node2 = node1;
        while (n-- > 0) {
            node2 = node2.next;
        }
        while (null != node2.next) {
            node1 = node1.next;
            node2 = node2.next;
        }
        node1.next = node1.next.next;
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
