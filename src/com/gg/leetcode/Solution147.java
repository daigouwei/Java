package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/23.
 */
public class Solution147 {
    public ListNode insertionSortList(ListNode head) {
        if (null == head || null == head.next)
            return head;
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        ListNode curOld = head;
        while (null != curOld) {
            ListNode tmp = curOld.next;
            ListNode pre = dummyHead;
            ListNode cur = dummyHead.next;
            boolean isInsertion = false;
            while (null != cur) {
                if (curOld.val <= cur.val && curOld.val >= pre.val) {
                    pre.next = curOld;
                    curOld.next = cur;
                    isInsertion = true;
                    break;
                }
                else {
                    pre = cur;
                    cur = cur.next;
                }
            }
            if (!isInsertion) {
                pre.next = curOld;
                curOld.next = cur;//curOld.next = null
            }
            curOld = tmp;
        }
        return dummyHead.next;
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
