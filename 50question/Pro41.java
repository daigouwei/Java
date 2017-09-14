/*
 * 海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子分为五份，多了一个，这只猴子把多的
 * 一个扔入海里，拿走了一份。第二只猴子把剩下的桃子又平均分成了五份，又多了一个，它同样把
 * 多的一个扔入海中，拿走了一份。第三只、第四只、第五只猴子都是这样做的，问原来有多少桃子？
 * 程序分析：最后一个猴子应该面前是6个桃子才对。
 *
 * get知识点：
 * （1）逻辑上需要理一理
 * （2）使用break和flag
 */


public class Pro41
{
    public static void main(String[] args)
    {
        Peach pe = new Peach();
        pe.peachNum();
        System.out.println(pe.getPeach());
    }
}

class Peach
{
    private int peach;

    public int getPeach()
    {
        return peach;
    }

    public void peachNum()
    {
        int num = 0;
        int tmp = 0;
        boolean isRemainder = true;
        while(true)
        {
            tmp = num;

            for(int i = 0; i < 5; i++)
            {
                if((tmp-1) % 5 == 0)
                {
                    tmp = tmp-(1+(tmp-1)/5);
                }
                else
                {
                    num++;
                    isRemainder = false;
                    break;
                }
            }

            if(isRemainder)
            {
                peach = num;
                break;
            }
            else
                isRemainder = true;
        }
    }
}
