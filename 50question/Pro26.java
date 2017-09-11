/*
 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 * 程序分析：可以使用switch语句进行判断。
 *
 * get知识点：
 * （1）熟悉一下switch
 * （2）使用了String类的方法char charAt(int index)方法
 */

import java.util.Scanner;

public class Pro26
{
    public static void main(String[] args)
    {
        JudgeWeek jw = new JudgeWeek();
        jw.inputWeek();
        System.out.println(jw.judgeWeekName());
    }
}

class JudgeWeek
{
    private String week;
    private int weekNum;

    public void inputWeek()
    {
        System.out.print("Please input shorthand week: ");
        Scanner scan = new Scanner(System.in);
        week = scan.nextLine();
        scan.close();
    }

    public int judgeWeekName()
    {
        char chFirst = week.charAt(0);
        char chSecond = week.charAt(1);

        switch(chFirst)
        {
            case 'M':
                weekNum = 1;
                break;
            case 'T':
                switch(chSecond)
                {
                    case 'u':
                        weekNum = 2;
                        break;
                    case 'h':
                        weekNum = 4;
                        break;
                    default:
                        break;
                }
                break;
            case 'W':
                weekNum = 3;
                break;
            case 'F':
                weekNum = 5;
                break;
            case 'S':
                switch(chSecond)
                {
                    case 'a':
                        weekNum = 6;
                        break;
                    case 'u':
                        weekNum = 7;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        return weekNum;
    }
}
