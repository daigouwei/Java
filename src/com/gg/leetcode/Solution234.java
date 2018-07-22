package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/22.
 */
public class Solution234 {
    public static void main(String[] args) {
        Solution234 solution234 = new Solution234();
        ListNode node1 = solution234.new ListNode(0);
        ListNode node2 = solution234.new ListNode(0);
        node1.next = node2;
        boolean isPalindrome = solution234.isPalindrome(node1);
        System.out.println();
    }

    public boolean isPalindrome(ListNode head) {
        if (null == head || null == head.next)
            return true;
        int len = 0;
        ListNode cur = head;
        while (null != cur) {
            cur = cur.next;
            len++;
        }
        int cnt = 0;
        int splitPoint = len / 2;
        ListNode pre = null;
        cur = head;
        while (cnt < splitPoint) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
            cnt++;
        }
        if (0 != len % 2)
            cur = cur.next;
        while (null != cur || null != pre) {
            if (cur.val != pre.val)
                return false;
            cur = cur.next;
            pre = pre.next;
        }
        return true;
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
