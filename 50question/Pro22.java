/*
 * 利用递归方法求n！。
 * 程序分析：使用递归公式。
 *
 * get知识点：
 * （1）故意将写法复杂化，按照面向过程的写法不需要这么冗余
 */

public class Pro22
{
    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        f.show(6);
    }
}

class Factorial
{
    private int n;

    Factorial()
    {
        n = 5;
    }

    private int fac(int n)
    {
        if(n == 1)
            return 1;
        else
            return n*fac(n-1);
    }

    public void show(int n)
    {
        this.n = n;
        System.out.println(this.n+"的阶乘是"+fac(this.n));
    }
}
