package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/9.
 */
public class Solution92 {
    public static void main(String[] args) {
        Solution92 solution92 = new Solution92();
        List<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        ListNode listNode = solution92.convertList2ListNode(list);
        ListNode res = solution92.reverseBetween(listNode, 2, 2);
        System.out.println();
    }

    public ListNode convertList2ListNode(List<Integer> list) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        for (int ele : list) {
            cur.next = new ListNode(ele);
            cur = cur.next;
        }
        return dummyHead.next;
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (null == head || m == n)
            return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;
        ListNode n1 = null;
        ListNode n2 = null;
        ListNode tmp = null;
        int cnt = 0;
        while (++cnt <= n) {
            if (cnt < m) {
                pre = cur;
                cur = cur.next;
            }
            else if (cnt == m) {
                n1 = pre;
                n2 = cur;
                tmp = cur.next;
                cur.next = null;
                pre = cur;
                cur = tmp;
            }
            else {
                tmp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = tmp;
            }
        }
        n1.next = pre;
        n2.next = cur;
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
