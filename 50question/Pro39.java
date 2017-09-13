/*
 * 编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n;
 * 输入为奇数时，调用函数求1/1+1/3+...+1/n。
 * 程序分析：先判断奇偶数，再进行函数调用。
 *
 * get知识点：
 * （1）多态的使用
 * （2）注意Scanner中close方法的用法
 */

import java.util.Scanner;

public class Pro39
{
    private static Num num;

    public static void main(String[] args)
    {
        //第一种普通写法
        System.out.println("第一种普通写法");
        Summation sum = new Summation();
        sum.inputNum();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println();

        //第二种多态写法
        System.out.println("第二种多态写法");
        num = new Num();
        num.inputNum();
        num.judgeNum();
        if(num.getEvenOdd() == true)
            func(new EvenNum());
        else
            func(new OddNum());
    }

    public static void func(Num num)
    {
        num.sum(Pro39.num.getN());
    }
}

class Summation
{
    private int n;

    public void inputNum()
    {
        System.out.print("Please input a number n = ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        //scan.close();

        boolean jud = judgeNum();
        if(jud == true)
            sumEven();
        else
            sumOdd();
    }

    private boolean judgeNum()
    {
        if(n%2 == 0)
        {
            System.out.println("even");
            return true;
        }
        else
        {
            System.out.println("odd");
            return false;
        }
    }

    private void sumEven()
    {
        double val = 2;
        double sum = 0;
        while(val <= n)
        {
            sum += 1/val;
            val += 2;
        }
        System.out.println(sum);
    }

    private void sumOdd()
    {
        double val = 1;
        double sum = 0;
        while(val <= n)
        {
            sum += 1/val;
            val += 2;
        }
        System.out.println(sum);
    }
}

class Num
{
    private int n;
    private boolean evenOdd;

    public final boolean getEvenOdd()
    {
        return evenOdd;
    }

    public final int getN()
    {
        return n;
    }

    public final void inputNum()
    {
        System.out.print("Please input a number n = ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        scan.close();
    }

    public final void judgeNum()
    {
        if(n%2 == 0)
        {
            System.out.println("Even");
            evenOdd = true;
        }
        else
        {
            System.out.println("Odd");
            evenOdd = false;
        }
    }

    public void sum(int n){}
}

class EvenNum extends Num
{
    public void sum(int n)
    {
        double val = 2;
        double sum = 0;
        while(val <= n)
        {
            sum += 1/val;
            val += 2;
        }
        System.out.println(sum);
    }
}

class OddNum extends Num
{
    public void sum(int n)
    {
        double val = 1;
        double sum = 0;
        while(val <= n)
        {
            sum += 1/val;
            val += 2;
        }
        System.out.println(sum);
    }
}
