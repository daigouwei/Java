/*
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * 程序分析：在10万以内进行判断，先将该数加上100后再开方，再将该数加上268后再开方，如果
 * 开方后结果满足题目要求，即是该数。
 *
 * get知识点：
 * （1）Math.sqrt结果为double类型强制转换为int类型
 */

import java.util.Scanner;

public class Pro13
{
    public static void main(String[] args)
    {
        System.out.print("Please input number: ");
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        scan.close();

        guessNumber(range);
    }

    static void guessNumber(int range)
    {
        boolean isComp = false;
        int num = 0;
        for(int i = 1; i < range; i++)
        {
            if(Math.pow((int)Math.sqrt(i + 100), 2) == i + 100)
                if(Math.pow((int)Math.sqrt(i + 268), 2) == i + 268)
                {
                    isComp = true;
                    num = i;
                    break;
                }
        }
        if(isComp == true)
            System.out.println(num);
    }
}
