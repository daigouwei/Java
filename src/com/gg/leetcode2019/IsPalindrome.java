package com.gg.leetcode2019;

//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//说明：本题中，我们将空字符串定义为有效的回文串。

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.trim().toLowerCase();
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            char headCh = s.charAt(head);
            if (!((headCh >= 'a' && headCh <= 'z') || (headCh >= '0' && headCh <= '9'))) {
                head++;
                continue;
            }
            char tailCh = s.charAt(tail);
            if (!((tailCh >= 'a' && tailCh <= 'z') || (tailCh >= '0' && tailCh <= '9'))) {
                tail--;
                continue;
            }
            if (headCh != tailCh) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean isPalindrome = new IsPalindrome().isPalindrome(str);
        System.out.println(isPalindrome);
    }
}
