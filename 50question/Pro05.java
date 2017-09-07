/*
 *利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
 *60分以下的用C表示。
 *程序分析：(a>b)?a:b 这是条件运算符的基本例子。
 *
 *get知识点：
 *（1）条件运算符的用法
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Pro05
{
	public static void main(String[] args)
	{
		System.out.print("Please input a number: ");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String val = "";
		try
		{
			val = br.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		int val_int = Integer.parseInt(val);

		gradeClassify(val_int);
	}

	static void gradeClassify(int score)
	{
		if(score > 100 || score < 0)
			System.out.println("No!!");
		else
		{
			String grade = (score >= 90) ? "A" : ((score >= 60) ? "B" : "C");
			System.out.println(score + " is " + grade);
		}
	}
}
