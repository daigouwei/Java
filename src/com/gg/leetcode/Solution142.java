package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/22.
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (null == head || null == head.next)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (slow == fast) {
            slow = head;
            while (null != slow) {
                if (slow == fast)
                    return slow;
                slow = slow.next;
                fast = fast.next;
            }
        }
        else
            return null;
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
