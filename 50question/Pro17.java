/*
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，然后多吃一个。到第十天早上想
 * 再吃的时候，只剩下一个桃子了。求第一天共摘了多少桃子？
 * 程序分析：采取逆向思维的方法，从后往前推断。
 *
 * get知识点：
 * （1）啥也get不到，不建议做，差评
 */

public class Pro17
{
    public static void main(String[] args)
    {
        monkeyPeach();
    }

    static void monkeyPeach()
    {
        int peach = 1;
        for(int i = 9; i > 0; i--)
            peach = (peach + 1) * 2;
        System.out.println(peach);
    }
}
