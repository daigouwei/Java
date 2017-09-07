/*
 * 输出9*9口诀。
 * 程序分析：分行与列考虑，共9行9列。
 *
 * get知识点：
 * （1）System.out的输出形式一共可以有三种：println,print,printf
 */

public class Pro16
{
    public static void main(String[] args)
    {
        nineListbox();
    }

    static void nineListbox()
    {
        for(int line = 1; line <= 9; line++)
        {
            for(int row = 1; row <= line; row++)
            {
                System.out.printf("%d*%d=%d ", line, row, line * row);
            }
            System.out.print("\n");
        }
    }
}
