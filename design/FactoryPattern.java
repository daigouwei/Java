/**
 *工厂模式
 *分为简单工厂模式、工厂方法模式、抽象工厂模式。
 */

public class FactoryPattern
{
    public static void main(String[] args)
    {
        //Simple Factory Pattern
        PizzaStore ps = new PizzaStore(new SimplePizzaFactory());
        ps.orderPizza("CheesePizza");
        ps.orderPizza("ClamPizza");
    }
}


//Simple Factory Pattern
class PizzaStore
{
    Pizza pizza;
    SimplePizzaFactory spf;

    PizzaStore(SimplePizzaFactory spf){this.spf = spf;}

    void orderPizza(String type)
    {
        pizza = spf.createPizza(type);

        pizza.declare();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}

class SimplePizzaFactory
{
    Pizza createPizza(String type)
    {
        if(type.equals("CheesePizza"))
            return new CheesePizza();
        else if(type.equals("ClamPizza"))
            return new ClamPizza();
        else
            return null;
    }
}

abstract class Pizza
{
    abstract void declare();
    void prepare(){sop("prepare");}
    void bake(){sop("bake");}
    void cut(){sop("cut");}
    void box(){sop("box");}

    void sop(Object obj)
    {
        System.out.println(obj);
    }
}

class CheesePizza extends Pizza
{
    void declare(){sop("This is CheesePizza");}
}

class ClamPizza extends Pizza
{
    void declare(){sop("This is ClamPizza");}
}




