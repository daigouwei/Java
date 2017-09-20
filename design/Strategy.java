/**
 *策略模式
 *定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
 */
public class Strategy
{
    public static void main(String[] args)
    {
        RedheadDuck redhead = new RedheadDuck();
        redhead.swim();
        redhead.display();
        redhead.show(new FlyWithWings(), new Quack());

        RubberDuck rubber = new RubberDuck();
        rubber.swim();
        rubber.display();
        rubber.show(new FlyNoWay(), new Squeak());
    }
}



/**
 *核心代码块，一个基础类和定义的算法族接口。就是松耦合，让一个class随意搭配多个接口interface行为。
 */
abstract class Duck
{
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim()
    {
        System.out.println("swim");
    }

    public abstract void display();

    public abstract void show(FlyBehavior flyBehavior, QuackBehavior quackBehavior);
}

interface FlyBehavior
{
    public abstract void fly();
}

interface QuackBehavior
{
    public abstract void quack();
}



/**
 *核心代码块的继承和实现。
 */
class FlyWithWings implements FlyBehavior
{
    public void fly()
    {
        System.out.println("fly");
    }
}

class FlyNoWay implements FlyBehavior
{
    public void fly()
    {
        System.out.println("no fly");
    }
}

class Quack implements QuackBehavior
{
    public void quack()
    {
        System.out.println("guaguagua");
    }
}

class Squeak implements QuackBehavior
{
    public void quack()
    {
        System.out.println("zhizhizhi");
    }
}

class RedheadDuck extends Duck
{
    public void display()
    {
        System.out.println("RedheadDuck");
    }

    public void show(FlyBehavior flyBehavior, QuackBehavior quackBehavior)
    {
        flyBehavior.fly();
        quackBehavior.quack();
    }
}

class RubberDuck extends Duck
{
    public void display()
    {
        System.out.println("RubberDuck");
    }

    public void show(FlyBehavior flyBehavior, QuackBehavior quackBehavior)
    {
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
