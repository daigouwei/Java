package com.gg.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guowei on 2018/7/22.
 */
public class Solution138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (null == head)
            return null;
        Map<RandomListNode, RandomListNode> storeMap = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode dummyHead = new RandomListNode(0);
        RandomListNode pre = dummyHead;
        RandomListNode cur = head;
        while (null != cur) {
            RandomListNode node = new RandomListNode(cur.label);
            storeMap.put(cur, node);
            pre.next = node;
            pre = node;
            cur = cur.next;
        }
        RandomListNode curOld = head;
        RandomListNode curNew = dummyHead.next;
        while (null != curOld) {
            if (null != curOld.random)
                curNew.random = storeMap.get(curOld.random);
            curOld = curOld.next;
            curNew = curNew.next;
        }
        return dummyHead.next;
    }

    class RandomListNode {
        int label;
        RandomListNode next, random;

        public RandomListNode(int label) {
            this.label = label;
            this.next = null;
            this.random = null;
        }
    }
}
