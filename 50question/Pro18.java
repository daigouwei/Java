/*
 * 两个乒乓球队进行比赛，各自出3人。甲队为a,b,c三人，乙队为x，y，z三人。已抽签决定比赛名单。
 * 有人向队员打听比赛的名单。a说他不和x比，c说他不和x，z比，请编程找出比赛名单。
 * 程序分析：
 *
 * get知识点：
 * （1）ArrayList也是可以储存类的
 * （2）值得一做
 */

import java.util.ArrayList;

public class Pro18
{
    public static void main(String[] args)
    {
        Game g = new Game();
        g.realizeGroup();
    }
}

class Game
{
    private String a;
    private String b;
    private String c;
    private final String[] str = {"x", "y", "z"};

    Game(){}

    Game(String a, String b, String c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void realizeGroup()
    {
        ArrayList<Game> arr = new ArrayList<Game>();
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                for(int k = 0; k < 3; k++)
                {
                    Game ga = new Game(str[i], str[j], str[k]);
                    if((!ga.a.equals(b)) && (!ga.a.equals(c)) && (!ga.b.equals(c)) &&
                        (!ga.a.equals("x") && (!ga.c.equals("x")) && (!ga.c.equals("z"))))
                        arr.add(ga);
                }
        for(Game ar : arr)
            System.out.println(ar);
    }

    public String toString()
    {
        return "a is "+a+", b is "+b+", c is "+c;
    }

}
