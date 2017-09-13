/*
 * 写一个函数，求一个字符串的长度。
 * 程序分析：先输入字符串再进行计数。
 *
 * get知识点：
 * （1）String转化为char
 */

import java.util.Scanner;

public class Pro38
{
    public static void main(String[] args)
    {
        System.out.print("Please input a string: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        char[] ch = str.toCharArray();
        System.out.println(str+"共有"+ch.length+"个字符。");
    }
}
