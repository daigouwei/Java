/*
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数。
 * 程序分析：就是使用冒泡排序的冒泡方法将后面m个数冒泡上去。
 *
 * get知识点：
 * （1）其实要确定n比m大才对
 */


public class Pro36
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Bubble.bubble(arr, 7);
        for(int num : arr)
            System.out.println(num);
    }
}

class Bubble
{
    public static void bubble(int[] arr, int m)
    {
        for(int i = 0; i < m; i++)
        {
            for(int j = arr.length-m+i; j > i; j--)
            {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
    }
}
