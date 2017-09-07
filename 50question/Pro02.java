/*
 * 判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：用一个数去除2到sqrt，如果能被整除，则表明此数不是素数，反之是素数。
 */

public class Pro02
{
	public static void main(String[] args)
	{
		int[] val = primeNum();
		for(int i : val)
		{
			if(i != 0)
				System.out.println(i);
		}
	}

	static int[] primeNum()
	{
		int[] val = new int[100];
		int cnt = 0;

		for(int num = 101; num <= 200; num++)
		{
			for(int i = 2; i <= (int)Math.sqrt(num); i++)
			{
				if(num % i == 0)
				{
					//val[cnt++] = num;
					break;
				}
				if(i == (int)Math.sqrt(num))
					val[cnt++] = num;
			}
		}
		return val;
	}
}
