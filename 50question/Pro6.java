/*
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 程序分析：利用辗除法可以求得最大公约数，而最小公倍数可以用两数乘积除以最小公约数。
 * 有两个整数27和15，则27%15余12,15%12余数3,12%3余数0，所以3是最大公约数。
 *
 * get知识点：
 * （1）辗转相除法
 * （2）比较两数大小
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro6
{
	public static void main(String[] args)
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String val1 = "";
		String val2 = "";
		try
		{
			System.out.print("Pelease input a number: ");
			val1 = br.readLine();
			System.out.print("Pelease input a number: ");
			val2 = br.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		int val1_int = Integer.parseInt(val1);
		int val2_int = Integer.parseInt(val2);
		int max_divisor = maxDivisor(val1_int, val2_int);
//		System.out.println(max_divisor);
		int min_multiple = minMultiple(val1_int, val2_int);
		System.out.println(max_divisor + " " + min_multiple);
	}

	static int maxDivisor(int val1, int val2)
	{
		int val_max = -1;
		int val_min = -1;
		int val = -1;
		val_max = (val1 / val2 != 0) ? val1 : val2;
		val_min = (val1 / val2 == 0) ? val1 : val2;
		val = val_max % val_min;
		while(val != 0)
		{
			val_max = val_min;
			val_min = val;
			val = val_max % val_min;
		}
		return val_min;
//		System.out.println(val_min);
	}

	static int minMultiple(int val1, int val2)
	{
//		System.out.println(val1 * val2 / maxDivisor(val1, val2));
		return val1 * val2 / maxDivisor(val1, val2);
	}
}
