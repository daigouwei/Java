/*
 * 将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 * （1）如果这个质数恰好等于n，则说明分解质因数的过程已经结束，打印出即可。
 * （2）如果n！=k，但n能被k整除，则应打印出k的值，并用n除以k的商，作为新的正整数n，重复执行第一步。
 * （3）如果n不能被k整除，则用k+1作为k的值，重复执行第一步。
 *
 * get知识点：
 * （1）输入字符串
 * （2）try...catch异常处理
 * （3）输入的string转换为int
 * （4）非循环输出数组的方式
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pro04
{
	public static void main(String[] args)
	{
		System.out.print("Please input a number: ");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String val = "";       //定义且要初始化

		try
		{
			val = br.readLine();      //这里定义的变量是局部变量
//			System.out.println(val);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		int val_int = Integer.parseInt(val);
//		System.out.println(val_int);
		int[] prime = decomposePrime(val_int);

//		String int_array_string = Arrays.toString(prime);
//		System.out.println(int_array_string);

		System.out.print(val_int + "=");
		boolean isFirst = true;
		for(int prime_num : prime)
		{
			if(isFirst == true)
			{
				isFirst = false;
				if(prime_num != 0)
					System.out.print(prime_num);
				else
					break;
//				System.out.print("*");
			}
			else
			{
				if(prime_num != 0)
				{
					System.out.print("*");
					System.out.print(prime_num);
				}
				else
					break;
			}
		}
	}

	static int[] decomposePrime(int val)
	{
		int k = 2;
		int cnt = 0;
		int[] prime = new int[100];
		while(val != k)
		{
			if(val % k == 0)
			{
//				System.out.println(k);
				prime[cnt++] = k;
				val = val / k;
			}
			else
				k = k + 1;
		}
//		System.out.println(k);
		prime[cnt++] = k;
		return prime;
	}
}
