/*
 * 字符串排序。
 * 程序分析：使用compareTo方法按字典顺序进行比较。
 *
 * get知识点：
 * （1）其实本质上还是冒泡排序，只是用了String的compareTo方法
 */

public class Pro40
{
    public static void main(String[] args)
    {
        String[] str = {"abc", "cad", "m", "fa", "f"};
        for(int i = 0; i < str.length-1; i++)
        {
            for(int j = str.length-2; j >= i; j--)
            {
                if(str[j+1].compareTo(str[j]) < 0)
                {
                    String tmp = str[j+1];
                    str[j+1] = str[j];
                    str[j] = tmp;
                }
            }
        }
        for(String s : str)
            System.out.println(s);
    }
}
