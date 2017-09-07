/*
 * 打印出所有的”水仙花数“，所谓”水仙花数“是指一个三位数，其各位数字立方和等于该数本身。
 * 例如153就是水仙花数。
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位、十位、百位。
 */

public class Pro03
{
	public static void main(String[] args)
	{
		for(int i = 100; i < 1000; i++)
		{
			if(narcissus(i) == true)
				System.out.println(i);
		}
	}

	static boolean narcissus(int val)
	{
		int val_bai = val / 100;
		int val_shi = (val - val_bai * 100) / 10;
		int val_ge  = val % 10;

		if (Math.pow(val_bai, 3) + Math.pow(val_shi, 3) + Math.pow(val_ge, 3) == val)
			return true;
		else
			return false;
	}
}
