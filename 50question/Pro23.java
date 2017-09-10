/*
 * 有5个人坐在一起，问第5个人多少岁，他说比第4个大两岁，以此类推，
 * 最后一个人说他10岁。使用递归求第5个人的岁数。
 * 程序分析：利用递归的方法，递归分为会腿和递推两个阶段。
 *
 * get知识点：
 * （1）跟22题差不多，啥都get不到，别做了
 */

public class Pro23
{
    public static void main(String[] args)
    {
        Ege e = new Ege(7);
        e.show();
    }
}

class Ege
{
    private int n;

    Ege(int n)
    {
        this.n = n;
    }

    private int factorial(int n)
    {
        if(n == 1)
            return 10;
        else
            return factorial(n-1)+2;
    }

    public void show()
    {
        System.out.println("第"+n+"个孩子"+factorial(n)+"岁...");
    }
}
