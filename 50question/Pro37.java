/*
 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，
 * 问最后留下的是原来第几号的那位。
 * 程序分析：将数组类型定义为bool型，在圈内就是true，不在圈内就是false。
 *
 * get知识点：
 * （1）数组索引，用于到数组尾部将索引置0
 * （2）总人数，当多余1的时候while
 * （3）3人一个计数淘汰
 * （4）感觉后期可以使用循环链表试试
 */

public class Pro37
{
    public static void main(String[] args)
    {
        RoundThree rt = new RoundThree(9);
        int i = rt.inputNum();
        System.out.println(i+1);
    }
}

class RoundThree
{
    private int n;

    RoundThree(int n)
    {
        this.n = n;
    }

    public int inputNum()
    {
        boolean[] arr = new boolean[n];
        //for(boolean i : arr)
            //i = true;
        for(int i = 0; i < n; i++)
            arr[i] = true;

        int index = 0;          //数组索引，用于到数组尾部将索引置0
        int threeCnt = 0;       //3人一个计数淘汰
        int headcount = n;      //总人数，当多余1的时候while

        while(headcount > 1)
        {
            if(index == n)
                index = 0;
            if(arr[index] == true)
                threeCnt++;
            if(threeCnt == 3)
            {
                arr[index] = false;
                headcount--;
                threeCnt = 0;
            }
            index++;
        }

        for(int i = 0; i < n; i++)
        {
            if(arr[i]==true)
                return i;
        }

        return -2;
    }
}
