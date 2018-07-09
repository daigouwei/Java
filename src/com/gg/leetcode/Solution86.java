package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/9.
 */
public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        if (null == head)
            return head;
        ListNode l1 = new ListNode(0);
        ListNode tmp1 = l1;
        ListNode l2 = new ListNode(0);
        ListNode tmp2 = l2;
        ListNode cur = head;
        ListNode tmp = null;
        while (null != cur) {
            if (cur.val < x) {
                tmp1.next = cur;
                tmp1 = tmp1.next;
                tmp = cur.next;
                tmp1.next = null;
            }
            else {
                tmp2.next = cur;
                tmp2 = tmp2.next;
                tmp = cur.next;
                tmp2.next = null;
            }
            cur = tmp;
        }
        tmp1.next = l2.next;
        return l1.next;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
