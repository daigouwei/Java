/*
 * 一球从100米高度自由落下，每次落地后反弹回原来高度的一半，求它在第十次落地时，共经过多少米？
 * 第十次反弹多高？
 * 程序分析：算出反弹高度和第几次反弹之间的关系。
 *
 * get知识点：
 * （1）ArrayList有方法.get获得数组元素
 */

import java.util.ArrayList;

public class Pro10
{
	public static void main(String[] args)
	{
		freeFallingBody(100, 2);
	}

	static void freeFallingBody(double height, int n)
	{
		double height_sum = 0;
		double height_each = 0;
		ArrayList<Double> height_bounce = new ArrayList<Double>();
		for(int i = 0; i <= n; i++)
		{
			height_bounce.add(height / (double)Math.pow(2, i));
			height_each = height / (double)Math.pow(2, i);
			if(i != n)
			{
				if(i != 0)
					height_sum += height_each * 2;
				else
					height_sum += height_each;
			}
		}
		System.out.println("第十次反弹" + height_bounce.get(n) + "米");
		System.out.println("在第十次落地时共经过" + height_sum + "米");
	}
}
