/*
 * 输入某年某月某日，判断这一天是这一年的第几天。
 * 程序分析：需要注意闰年的情况。
 *
 * get知识点：
 * （1）使用Integer.parseInt可以将str转换为int
 */

import java.util.Scanner;

public class Pro14
{
    public static void main(String[] args)
    {
        System.out.print("Please input a date such as 2017-09-07: ");
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        System.out.println(date);
        String[] dateArray = date.split("-");
        judgeDay(dateArray);
    }

    static void judgeDay(String[] dateArray)
    {
        int cnt = 0;
        int daySum = 0;
        int[] date = new int[dateArray.length];
        for(String dateStr : dateArray)
            date[cnt++] = Integer.parseInt(dateStr);
        int[] monthDayCnt = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int eachMonth = 0; eachMonth < date[1] - 1; eachMonth++)
            daySum += monthDayCnt[eachMonth];
        if((((date[0] % 100 == 0) && (date[0] % 400 == 0)) ||
            ((date[0] % 100 != 0) && (date[0] % 4 == 0))) &&
            (date[1] > 2))
            daySum += date[2] + 1;
        else
            daySum += date[2];
        System.out.println("第" + daySum + "天");
    }
}
