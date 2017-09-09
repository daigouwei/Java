/*
 * 求1+2!+3!+...+20!的和。
 * 程序分析：可以通过递归或者循环来解决累乘。
 *
 * get知识点：
 * （1）
 */

public class Pro21
{
    public static void main(String[] args)
    {
        TotalProduct sumProduct = new TotalProduct(2, 3);
        sumProduct.sum();
    }
}

class TotalProduct
{
    private int startNum;
    private int endNum;

    TotalProduct()
    {
        startNum = 1;
        endNum = 20;
    }

    TotalProduct(int startNum, int endNum)
    {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    private int product(int num)
    {
        int sum = 1;

        for(int i=num; i>0; i--)
            sum *= i;

        return sum;
    }

    public void sum()
    {
        int val = 0;

        for(int i=startNum; i<=endNum; i++)
        {
            val += product(i);
        }

        System.out.println(startNum+"和"+endNum+"直接累乘和为"+val);
    }
}
