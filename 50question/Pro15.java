/*
 * 输入3个整数x,y,z,请把这三个数由小到大输出。
 * 程序分析：把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，
 * 然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使得x最大。
 *
 * get知识点：
 * （1）ArrayList有方法set来进行数组元素的赋值
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Pro15
{
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Please input a number: ");
            num.add(scan.nextInt());
        }
        scan.close();

        System.out.println(sort(num));
    }

    static ArrayList<Integer> sort(ArrayList<Integer> num)
    {
        int tmp = -1;
        if(num.get(0) > num.get(1))
        {
            tmp = num.get(0);
            num.set(0, num.get(1));
            num.set(1, tmp);
        }
        if(num.get(1) > num.get(2))
        {
            tmp = num.get(1);
            num.set(1, num.get(2));
            num.set(2, tmp);
        }
        if(num.get(0) > num.get(1))
        {
            tmp = num.get(0);
            num.set(0, num.get(1));
            num.set(1, tmp);
        }
        return num;
    }
}
