/*
 * 给定一个不多于5位数的正整数，求它是几位数并逆序打印出各位数字。
 * 程序分析：写一个数字类，写两个方法来进行判断和打印。
 *
 * get知识点：
 * （1）强行使用了开关语句switch，注意每条case后面没有break
 * （2）比较完善的面向对象编程
 * （3）值得看一看做一做
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Pro24
{
    public static void main(String[] args)
    {
        PositiveInt pos = new PositiveInt();

        if(pos.inputNum())
        {
            System.out.println(pos.howManyDigits()+"位数.");
            ArrayList<Integer> arr = pos.invertedOrder();
            for(int num : arr)
                System.out.print(num);
            System.out.println();
        }
    }
}

class PositiveInt
{
    private int num;

    public boolean inputNum()//输入一个数
    {
        System.out.print("Please a number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.close();

        boolean isLessFive = judgeNum();
        if(! isLessFive)
        {
            System.out.println("Sorry...");
            return false;
        }
        else
            return true;
    }

    private boolean judgeNum()
    {
        if((num > 99999) || (num < 0))
            return false;
        else
            return true;
    }

    public int howManyDigits()
    {
        if(num/10000 != 0)
            return 5;
        else if(num/1000 != 0)
            return 4;
        else if(num/100 != 0)
            return 3;
        else if(num/10 != 0)
            return 2;
        else
            return 1;
    }

    public ArrayList<Integer> invertedOrder()
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int whatDigit = howManyDigits();
        int number = num;

        switch(whatDigit)
        {
            case 5:
                arr.add(number%10);
                number = number/10;
            case 4:
                arr.add(number%10);
                number = number/10;
            case 3:
                arr.add(number%10);
                number = number/10;
            case 2:
                arr.add(number%10);
                number = number/10;
            case 1:
                arr.add(number);
                break;
            default:
                break;
        }

        return arr;
    }
}
