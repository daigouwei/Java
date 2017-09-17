/*
 * 计算字符中子串出现次数。
 * 程序分析：String和char的转换。
 *
 * get知识点：
 * （1）char的使用方法
 */

public class Pro49
{
    public static void main(String[] args)
    {
        String str = "I come from Country DingYuan Province AnHui.";
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == ' ')
                count++;
        }
        count++;

        System.out.println("共有"+count+"个子串。");
    }
}
