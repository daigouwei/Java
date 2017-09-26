/**
 *装饰者模式
 *动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
 */

public class DecoratorPattern
{
    public static void main(String[] args)
    {
        System.out.println(new Mocha(new Mocha(new HouseBlend())).getDescription());
    }
}

abstract class Beverage
{
    String description = "Unknow Beverage";
    public String getDescription()
    {
        return description;
    }
    public abstract double cost();
}

abstract class CondimentDecorator extends Beverage
{
    public abstract String getDescription();
}

class Espresso extends Beverage
{
    Espresso()
    {
        description = "Espresso";
    }
    public double cost()
    {
        return 1.99;
    }
}

class HouseBlend extends Beverage
{
    HouseBlend()
    {
        description = "HouseBlend";
    }
    public double cost()
    {
        return 0.89;
    }
}

class Mocha extends CondimentDecorator
{
    Beverage beverage;

    Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }
    public String getDescription()
    {
        return beverage.getDescription()+", Mocha";
    }
    public double cost()
    {
        return 0.20+beverage.cost();
    }
}
