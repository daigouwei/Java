/*
 * 打印出如下图图案（菱形）：
 *          *
 *         ***
 *        *****
 *       *******
 *        *****
 *         ***
 *          *
 * 程序分析：先把图形分成两部分来看待，前4行一个规律，后3行一个规律。利用
 * 双重for循环，第一层控制行，第二层控制列。
 *
 * get知识点：
 * （1）没什么语法上的get，但是实现方式还是值得一做的
 */

public class Pro19
{
    public static void main(String[] args)
    {
        printStar(7);
    }

    static void printStar(int lineVal)
    {
        for(int line = 1; line <= lineVal - lineVal / 2; line++)
        {
            for(int row = 1; row <= lineVal; row++)
            {
                if((row >= lineVal / 2 + 1 - (line - 1)) && (row <= lineVal / 2 + 1 + (line - 1)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int line = lineVal / 2 + 2; line <= lineVal; line++)
        {
            for(int row = 1; row <= lineVal; row++)
            {
                if((row >= lineVal / 2 + 1 - (lineVal - line)) && (row <= lineVal / 2 + 1 + (lineVal - line)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
