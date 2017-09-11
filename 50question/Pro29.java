/*
 * 求一个3*3矩阵的对角线元素之和。
 * 程序分析：利用双重循环控制输入二维数组，再将a[i][i]累加后输出。
 *
 * get知识点：
 * （1）get一下二维数组的用法
 */

import java.util.Scanner;

public class Pro29
{
    public static void main(String[] args)
    {
        Matrix mat = new Matrix();
        mat.inputMatrix();
        mat.countNum();
    }
}

class Matrix
{
    private int[][] num;
    private int value;

    public void inputMatrix()
    {
        Scanner scan = new Scanner(System.in);
        num = new int[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
            {
                System.out.println("Please input a number: ");
                num[i][j] = scan.nextInt();
            }
        scan.close();
    }

    public void countNum()
    {
        value = 0;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
            {
                if(i == j)
                    value += num[i][j];
            }

        System.out.println(value);
    }
}

