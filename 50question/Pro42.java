/*
 * 809*x = 800*x+9*x+1,其中x是两位数，8*x结果为两位数，9*x结果为三位数，求x。
 * 程序分析：根据给定信息先确定x的取值范围。
 *
 * get知识点：
 * （1）没用，题目有问题
 */

public class Pro42
{
    public static void main(String[] args)
    {
        int num = 0;

        for(int i = 10; i < 100; i++)
        {
            if(809*i == 800*i+9*i+1)
            {
                num = i;
                break;
            }
        }

        System.out.println(num);
    }
}
