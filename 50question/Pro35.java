/*
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 * 程序分析：先找出最大值和最小值的数组索引，然后进行交换操作。
 *
 * get知识点：
 * （1）注意ArrayList的add、set和get方法的操作，尤其赋值不能跟数组用法混起来
 * （2）这题还有个注意点就是需要考虑最大值和最小值在两端的情况，
 * 本身题目也有点问题，先交换最大值还是最小值会影响最后数组的排序
 */

import java.util.*;

public class Pro35
{
    public static void main(String[] args)
    {
        Array arr = new Array();
        arr.inputNum();
    }
}

class Array
{
    private int cnt;
    private ArrayList<Integer> arr;
    private int max;
    private int min;

    public void inputNum()
    {
        arr = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input array number: ");
        cnt = scan.nextInt();
        for(int i = 0; i < cnt; i++)
        {
            System.out.print("Please input a number: ");
            arr.add(i, scan.nextInt());
        }
        scan.close();
        System.out.println("原始数组为："+arr);

        swapVal();
    }

   private void swapVal()
    {
        min = 0;
        for(int i = 1; i < arr.size(); i++)
        {
            if(arr.get(min) > arr.get(i))
                min = i;
        }
        int tmp = arr.get(min);
        arr.set(min, arr.get(cnt-1));
        arr.set(cnt-1, tmp);

        max = 0;
        for(int i = 1; i < arr.size(); i++)
        {
            if(arr.get(max) < arr.get(i))
               max = i;
        }
        tmp = arr.get(max);
        arr.set(max, arr.get(0));
        arr.set(0, tmp);

        System.out.println("变化数组为："+arr);
    }
}
