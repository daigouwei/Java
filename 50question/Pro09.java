/*
 * 一个数如果恰好等于它的因子之和，这个数就称为”完数“。例如6=1+2+3，编程找出n以内的所有完数。
 * 程序分析：先要取得因子，在进行判断。
 *
 * get知识点：
 * （1）ArrayList的使用方法
 */

import java.util.ArrayList;

public class Pro09
{
	public static void main(String[] args)
	{
		ArrayList<Integer> integrity_num = new ArrayList<Integer>();
		integrity_num = integrityNumber(10000);
		for(int i : integrity_num)
			System.out.println(i);
	}

	static ArrayList<Integer> integrityNumber(int n)
	{
		int val = 1;
		int sum = 1;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		ArrayList<Integer> integrity_num = new ArrayList<Integer>();
		while(++val < n)
		{
			for(int i = 2; i < val; i++)
			{
				if(val % i == 0)
					prime.add(i);
			}
			for(int num : prime)
				sum += num;
			if(sum == val)
				integrity_num.add(val);
			sum = 1;
			prime.clear();
		}
		return integrity_num;
	}
}
