/*
 * 求s=a+aa+aaa+aaaa+a...a的值，其中a是一个数字。a以及数的个数由用户输入。
 * 程序分析：关键是计算出每一项的值。
 *
 * get知识点：
 * （1）使用更高级的Scanner类读取键盘输入
 * （2）数字的几次方调用Math.pow静态方法
 */

import java.util.Scanner;

public class Pro08
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input a = ");
		int a = scan.nextInt();
		System.out.print("Please input n = ");
		int n = scan.nextInt();
		scan.close();

		summation(a, n);
	}

	static void summation(int a, int n)
	{
		if(n == 0)
			System.out.println("NO!!");
		else
		{
			int sum = 0;
			for(int i = 1; i <= n; i++)
			{
				int j = i;
				while(j-- > 0)
					sum += a * Math.pow(10, j);
			}
			System.out.println(sum);
		}
	}
}
