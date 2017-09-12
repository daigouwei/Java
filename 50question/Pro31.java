/*
 * 将一个数组逆序输出。
 * 程序分析：用第一个和最后一个交换。
 *
 * get知识点：
 * （1）数组是传地址的，改变数组元素值就是实际值
 * （2）使用int[] arr = new int[]{}静态初始化方法是不需要写有多少位元素的，以防写错产生矛盾
 */


public class Pro31
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Array.arrayInvertedOrder(arr);
        for(int num : arr)
            System.out.println(num);
    }
}

class Array
{
    public static void arrayInvertedOrder(int[] arr)
    {
        for(int i = 0; i < arr.length/2; i++)
        {
            int tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }
        //return arr;
    }
}
