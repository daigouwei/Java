package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/8.
 */
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (null == head) {
            return head;
        }
        int cnt = 0;
        ListNode cur = head;
        while (null != cur) {
            cnt++;
            cur = cur.next;
        }
        k = k % cnt;
        ListNode node1 = head;
        ListNode node2 = head;
        while (k-- > 0) {
            node2 = node2.next;
        }
        while (null != node2.next) {
            node1 = node1.next;
            node2 = node2.next;
        }
        node2.next = head;
        head = node1.next;
        node1.next = null;
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
