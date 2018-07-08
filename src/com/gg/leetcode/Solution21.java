package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/8.
 */
public class Solution21 {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        ListNode l1 = solution21.new ListNode(1);
        ListNode l2 = solution21.new ListNode(1);
        ListNode l3 = solution21.mergeTwoLists(l1, l2);
        System.out.println();
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1 && null == l2) {
            return null;
        }
        ListNode dummyHeadNode = new ListNode(0);
        ListNode curNode = dummyHeadNode;
        while (null != l1 && null != l2) {
            if (l1.val < l2.val) {
                curNode.next = l1;
                l1 = l1.next;
            }
            else {
                curNode.next = l2;
                l2 = l2.next;
            }
            curNode = curNode.next;
        }
        curNode.next = null != l1 ? l1 : l2;
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
