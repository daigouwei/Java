public class InnerClassTest
{
    public static void main(String[] args)
    {
        Test1.function().method();
        Test2.function().method();
    }
}

interface Inter
{
    void method();
}

class Test1
{
    static class InterZi implements Inter
    {
        public void method()
        {
            System.out.println("hello1");
        }
    }

    public static InterZi function()
    {
        return new InterZi();
    }
}

class Test2
{
    public static Inter function()
    {
        return new Inter()
        {
            public void method()
            {
                System.out.println("hello2");
            }
        };
    }
}
