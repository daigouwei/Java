/*
 * 取一个整数从右端开始的4~7位。
 * 程序分析：这个整数是以二进制的形式展开的。
 *
 * get知识点：
 * （1）熟悉一下位操作符
 */


public class Pro32
{
    public static void main(String[] args)
    {
        BitOperate bo = new BitOperate(0x77d);
        System.out.println(bo.bitOperate());
    }
}

class BitOperate
{
    private int val;

    BitOperate(int val)
    {
        this.val = val;
    }

    public int bitOperate()
    {
        val = val >> 3;
        val &= 0x0f;
        return val;
    }
}
