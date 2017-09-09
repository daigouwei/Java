/*
 * 有一分数序列：2/1 3/2 5/3 8/5 13/8 21/13...求出这个数列前20项之和。
 * 程序分析：抓住分子和分母的变化规律。
 *
 * get知识点：
 * （1）尝试使用class的思想来编程,小试牛刀
 */

public class Pro20
{
    public static void main(String[] args)
    {
        Sum calculate = new Sum(2, 1, 20);
        calculate.sumVal();
    }
}

class Sum
{
    private int numerator;
    private int denominator;
    private int cnt;

    Sum()
    {
        numerator = 2;
        denominator = 1;
        cnt = 20;
    }

    Sum(int numerator, int denominator, int cnt)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        this.cnt = cnt;
    }

    public void sumVal()
    {
        double val = 0;
        int tmp = 0;

        for(int i=0; i<cnt; i++)
        {
            val += (double)numerator/(double)denominator;
            tmp = numerator;
            numerator += denominator;
            denominator = tmp;
        }

        System.out.println("前"+cnt+"项和为"+val+".");
    }
}
