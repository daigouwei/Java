package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/9.
 */
public class Solution0 {
    public static void main(String[] args) {
        Solution0 solution0 = new Solution0();
        List<Integer> list = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        ListNode listNode = solution0.convertList2ListNode(list);
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

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
