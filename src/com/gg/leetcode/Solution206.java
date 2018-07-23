package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/22.
 */
public class Solution206 {
    public static void main(String[] args) {
        Solution206 s = new Solution206();
        ListNode n1 = s.new ListNode(1);
        ListNode n2 = s.new ListNode(2);
        ListNode n3 = s.new ListNode(3);
        ListNode n4 = s.new ListNode(4);
        ListNode n5 = s.new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode res = s.reverseList(n1);
        System.out.println();
    }

    public ListNode reverseList(ListNode head) {
        if (null == head)
            return head;
        ListNode pre = null;
        ListNode cur = head;
        while (null != cur) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        if (null == head || null == head.next)
            return head;
        else {
            //假设自身反转方法是正确的，则可以先反转除了第一个剩下的所有节点
            ListNode node = reverseList2(head.next);
            //反转完成之后再处理第一个节点
            head.next.next = head;
            head.next = null;
            return node;
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
