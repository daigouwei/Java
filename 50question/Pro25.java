/*
 * 一个5位数判断它是不是回文数。
 * 程序分析：12321就是回文数，即个位与万位相同，十位与千位相同。
 *
 * get知识点：
 * （1）跟前面题目差不多，没什么新意，可以不做
 */

import java.util.Scanner;

public class Pro25
{
    public static void main(String[] args)
    {
        Palindromic pa = new Palindromic();
        pa.inputNum();
        if(pa.judgePalin())
            System.out.println("yes...");
        else
            System.out.println("no...");
    }
}

class Palindromic
{
    private int num;

    public void inputNum()
    {
        System.out.print("Please input a number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.close();
    }

    private boolean judgeNum()
    {
        if((num > 9999) && (num < 99999))
            return true;
        else
            return false;
    }

    public boolean judgePalin()
    {
        if(judgeNum())
        {
            int[] arr = new int[5];
            for(int i=0; i < 5; i++)
            {
                arr[i] = num%10;
                num /= 10;
            }
            if((arr[0] == arr[4]) && (arr[1] == arr[3]))
                return true;
            else
                return false;
        }
        else
        {
            System.out.println("Sorry...");
            return false;
        }
    }
}
