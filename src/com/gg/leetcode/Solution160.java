package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/22.
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB)
            return null;
        ListNode pA = headA;
        ListNode pB = headB;
        int countA = 0;
        int countB = 0;
        while (null != pA) {
            pA = pA.next;
            countA++;
        }
        while (null != pB) {
            pB = pB.next;
            countB++;
        }
        int num = 0;
        if (countA >= countB) {
            num = countA - countB;
            pA = headA;
            while (num-- > 0) {
                pA = pA.next;
            }
            pB = headB;
        }
        else {
            num = countB - countA;
            pB = headB;
            while (num-- > 0) {
                pB = pB.next;
            }
            pA = headA;
        }
        while (null != pB || null != pA) {
            if (pA == pB)
                return pA;
            pA = pA.next;
            pB = pB.next;
        }
        return null;
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
