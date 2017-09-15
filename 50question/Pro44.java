/*
 * 一个偶数总是能表示为两个素数之和。
 * 程序分析：将两个数都判断一下是不是素数。
 *
 * get知识点：
 * （1）
 */

import java.util.Scanner;

public class Pro44
{
    public static void main(String[] args)
    {
        Num n = new Num();
        n.inputNum();
    }
}

class Num
{
    private int num;

    public void inputNum()
    {
        System.out.print("Please input a number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        if(num%2 != 0)
            System.out.println("not even...");
        else
            splitNum();
    }

    private void splitNum()
    {
        for(int i = 2; i < num/2+1; i++)
        {
            if(prime(i) && prime(num-i))
            {
                System.out.println(num+"="+i+"+"+(num-i));
                break;
            }
        }
    }

    private boolean prime(int num)
    {
        boolean isPrime = true;

        for(int i = 2; i < Math.sqrt(num)+1; i++)
        {
            if(num%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
