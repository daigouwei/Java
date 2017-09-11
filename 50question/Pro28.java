/*
 * 对十个数进行从小到大排序。
 * 程序分析：可以使用选择排序，也可以使用冒泡排序。
 *
 * get知识点：
 * （1）温习一下排序算法
 * （2）冒泡排序i作为遍历次数，j用来从最下面依次比较交换相邻的两个数
 * （3）选择排序i作为遍历次数，j用来遍历所有数找出最小的数和相应的遍历i的数作交换
 */


public class Pro28
{
    public static void main(String[] args)
    {
        int[] num = {10, 6, 4, 9, 7, 8, 3, 5, 2, 1};

        System.out.println("Select Sort: ");
        for(int i : SelectSort.selectSort(num))
            System.out.println(i);

        System.out.println("Bubble Sort: ");
        for(int i : BubbleSort.bubbleSort(num))
            System.out.println(i);
    }
}

class SelectSort
{
    public static int[] selectSort(int[] num)
    {
        for(int i=0; i < num.length; i++)
        {
            int min = i;
            for(int j=i; j < num.length; j++)
            {
                if(num[min] > num[j])
                    min = j;
            }
            int tmp = num[i];
            num[i] = num[min];
            num[min] = tmp;
        }

        return num;
    }
}

class BubbleSort
{
    public static int[] bubbleSort(int[] num)
    {
        for(int i = 0; i < num.length; i++)
        {
            for(int j = num.length-2; j >= i; j--)
            {
                if(num[j+1] < num[j])
                {
                    int tmp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = tmp;
                }
            }
        }
        return num;
    }
}
