/*
 * 有一对兔子，从出生第3个月起每个月都生一对兔子，小兔子长到第三个月后也会每个月生一对兔子，
 * 求每个月兔子对数是多少。
 * 程序分析：兔子规律为数列 1,1,2,3,5,8,13,21...
 */

public class Pro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 3;
        System.out.println("第" + n + "个月兔子个数为" + fun(n));
	}

	private static int fun(int n)
	{
		if(n == 1 || n == 2)
			return 1;
		else
			return fun(n - 1) + fun(n - 2);
	}

}
