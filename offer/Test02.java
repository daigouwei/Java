public class Test02
{
    public static void main(String[] args)
    {
        System.out.println(Singleton01.getInstance() == Singleton01.getInstance());
        System.out.println(Singleton02.getInstance() == Singleton02.getInstance());
        System.out.println(Singleton03.getInstance() == Singleton03.getInstance());
    }
}

class Singleton01
{
    private final static Singleton01 single = new Singleton01();
    private Singleton01(){}
    public static Singleton01 getInstance()
    {
        return single;
    }
}

class Singleton02
{
    private static Singleton02 single = null;
    private Singleton02(){}
    public static Singleton02 getInstance()
    {
        if(single == null)
            single = new Singleton02();
        return single;
    }
}

class Singleton03
{
    private static Singleton03 single = null;
    private Singleton03(){}
    public static Singleton03 getInstance()
    {
        if(single == null)
        {
            synchronized(Singleton03.class)
            {
                if(single == null)
                    single = new Singleton03();
            }
        }
        return single;
    }
}
