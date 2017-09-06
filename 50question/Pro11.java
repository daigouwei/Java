/*
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 程序分析：可以填在百位、十位、个位的数字都是1、2、3、4。
 *
 * get知识点：
 * （1）ArrayList有个size()方法可以显示数组个数
 */

import java.util.ArrayList;

public class Pro11
{
	public static void main(String[] args)
	{
		formNumber();
	}

	static void formNumber()
	{
		int num = 0;
		ArrayList<Integer> form_number = new ArrayList<Integer>();
		for(int bai = 1; bai <= 4; bai++)
			for(int ge = 1; ge <= 4; ge++)
				for(int shi = 1; shi <= 4; shi++)
				{
					if((bai == shi) || (bai == ge) || (shi == ge))
						;
					else
					{
						num = bai * 100 + shi * 10 + ge;
						form_number.add(num);
					}
				}
		System.out.println(form_number);
		System.out.println(form_number.size());
	}
}
