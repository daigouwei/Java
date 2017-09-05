/*
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其他字符的个数。
 * 程序分析：将输入的字符分类处理。
 *
 * get知识点：
 * （1）String转为char数组
 * （2）printf用于格式化输出
 * （3）数组都有.length属性
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro7
{
	public static void main(String[] args)
	{
		System.out.print("Please input a string: ");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String val = "";

		try
		{
			val = br.readLine();
			//System.out.println(val);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		statChars(val);
	}

	static void statChars(String val)
	{
		int letter_cnt = 0;
		int digit_cnt = 0;
		int space_cnt = 0;
		int other_cnt = 0;
		char[] val_char = val.toCharArray();    //将字符串转化为字符数组
//		int len = val_char.length;     //.length是数组的属性不是类方法
		for(char ch : val_char)
		{
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				letter_cnt++;
			else if(ch >= '0' && ch <= '9')
				digit_cnt++;
			else if(ch == ' ')
				space_cnt++;
			else
				other_cnt++;
		}
		System.out.printf("字母个数为%d" +
		                  "数字个数为%d" +
		                  "空格个数为%d" +
		                  "其他字符个数为%d", letter_cnt, digit_cnt, space_cnt, other_cnt);
	}
}
