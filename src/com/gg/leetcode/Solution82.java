package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/8.
 */
public class Solution82 {
    public static void main(String[] args) {
        Solution82 solution82 = new Solution82();
        ListNode node1 = solution82.new ListNode(1);
        ListNode node2 = solution82.new ListNode(2);
        ListNode node3 = solution82.new ListNode(3);
        ListNode node4 = solution82.new ListNode(3);
        ListNode node5 = solution82.new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode l = solution82.deleteDuplicates(node1);
        System.out.println();
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode res = dummyHead;
        ListNode pre = dummyHead;
        boolean isFirst = true;
        ListNode cur = head;
        while (null != cur && null != cur.next) {
            if (!isFirst) {
                if (cur.next.val != cur.val && pre.val != cur.val) {
                    res.next = cur;
                    res = res.next;
                }
            }
            else {
                if (cur.next.val != cur.val) {
                    res.next = cur;
                    res = res.next;
                }
                isFirst = false;
            }
            pre = cur;
            cur = cur.next;
        }
        if (pre.val != cur.val) {
            res.next = cur;
        }
        else {
            res.next = null;
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
