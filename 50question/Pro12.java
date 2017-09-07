/*
 * 企业发放奖金根据利润提成。利润（I）低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，
 * 低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%;20万到40万之间时，高于20万元的部分，可提
 * 成5%;40万到60万之间时高于40万元的部分，可提成3%;60万到100万之间时，高于60万元的部分，可提成1.5%，
 * 高于100万元时，超过100万元的部分按1%提成，从键盘输入当年利润I，求应发奖金总数。
 * 程序分析：利用if语句来进行分界。
 *
 * get知识点：
 * （1）温习一下Scanner的用法
 */

import java.util.Scanner;

public class Pro12
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a number of the profit: ");
        double profit = scan.nextDouble();
        scan.close();

        calculatePrize(profit);
    }

    static void calculatePrize(double profit)
    {
        double prize = 0;
        if(profit > 100)
        {
            prize += (profit - 100) * 1 / 100;
            profit = 100;
        }
        if(profit > 60)
        {
            prize += (profit - 60) * 1.5 / 100;
            profit = 60;
        }
        if(profit > 40)
        {
            prize += (profit - 40) * 3 / 100;
            profit = 40;
        }
        if(profit > 20)
        {
            prize += (profit - 20) * 5 / 100;
            profit = 20;
        }
        if(profit > 10)
        {
            prize += (profit - 10) * 7.5 / 100;
            profit = 10;
        }
        if(profit <= 10)
            prize += profit * 10 / 100;
        System.out.println("奖金为" + prize + "万元");
    }
}

