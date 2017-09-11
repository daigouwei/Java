/*
 * 有一个已经排好序的数组，现输入一个数，要求按原来的规律将它插入数组。
 * 程序分析：首先判断此数是否大于最后一个数，然后在考虑插入中间的数的情况，插入后此元素之后的数，
 * 依次后移一个位置。
 *
 * get知识点：
 * （1）跟冒泡排序差不多，勉强可以做做
 */


public class Pro30
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 5, 6};
        for(int num : InsertSort.insertNum(arr, 3))
            System.out.println(num);
    }
}

class InsertSort
{
    public static int[] insertNum(int[] arr, int num)
    {
        int[] arrNew = new int[arr.length+1];
        arrNew[arr.length] = num;
        for(int i = 0; i < arr.length; i++)
            arrNew[i] = arr[i];

        for(int i = arr.length; i > 0; i--)
        {
            if(arrNew[i] < arrNew[i-1])
            {
                int tmp = arrNew[i];
                arrNew[i] = arrNew[i-1];
                arrNew[i-1] = tmp;
            }
        }
        return arrNew;
    }
}
