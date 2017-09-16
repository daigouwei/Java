/*
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
 * 每位数字都加上5，然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第
 * 三位交换。
 * 程序分析：输入四位整数，然后进行加密处理。
 *
 * get知识点：
 * （1）题目有问题，可能是除以10，不是除以10的余数，但是整体实现方法不变
 * （2）ArrayList中add和get要注意区分 */

import java.util.*;

public class Pro48
{
    public static void main(String[] args)
    {
        Encrypt en = new Encrypt();
        en.inputNum();
    }
}

class Encrypt
{
    private int num;

    public void inputNum()
    {
        System.out.print("Please input a number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.close();

        handleNum();
    }

    private void handleNum()
    {
        int tmp = num;

        tmp = (tmp+5)%10;
        ArrayList<Integer> digit = new ArrayList<Integer>();
        for(int i = 0; i < 4; i++)
        {
            digit.add((int)(tmp/(Math.pow(10, 3-i))));
            tmp %= Math.pow(10, 3-i);
        }

        //System.out.println(digit);

        swap(0, 3, digit);
        swap(1, 2, digit);

        //System.out.println(digit);

        tmp = 0;

        for(int i = 0; i < 4; i++)
        {
           tmp += digit.get(i)*Math.pow(10, 3-i);
           num = tmp;
        }

        System.out.println(num);
    }

    private void swap(int i, int j, ArrayList<Integer> digit)
    {
        int tmp = digit.get(i);
        digit.set(i, digit.get(j));
        digit.set(j, tmp);
    }
}


