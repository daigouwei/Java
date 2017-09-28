/**
 *工厂模式
 *分为简单工厂模式、工厂方法模式、抽象工厂模式。
 */

/*
//Simple Factory Pattern
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
*/


/*
//Factory Method Pattern
public class FactoryPattern
{
    public static void main(String[] args)
    {
        NyPizzaStore nps = new NyPizzaStore();
        nps.orderPizza("NyStyleCheesePizza");
        nps.orderPizza("NyStyleClamPizza");

        ChicagoPizzaStore cps = new ChicagoPizzaStore();
        cps.orderPizza("ChicagoStyleCheesePizza");
        cps.orderPizza("ChicagoStyleClamPizza");
    }
}


abstract class PizzaStore
{
    void orderPizza(String type)
    {
        Pizza pizza = createPizza(type);

        pizza.declare();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza createPizza(String type);
}

class NyPizzaStore extends PizzaStore
{
    Pizza createPizza(String type)
    {
        if(type.equals("NyStyleCheesePizza"))
            return new NyStyleCheesePizza();
        else if(type.equals("NyStyleClamPizza"))
            return new NyStyleClamPizza();
        else
            return null;
    }
}

class ChicagoPizzaStore extends PizzaStore
{
    Pizza createPizza(String type)
    {
        if(type.equals("ChicagoStyleCheesePizza"))
            return new ChicagoStyleCheesePizza();
        else if(type.equals("ChicagoStyleClamPizza"))
            return new ChicagoStyleClamPizza();
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

class NyStyleCheesePizza extends Pizza
{
    void declare(){sop("This is NyStyleCheesePizza");}
    void cut(){sop("cut NyStyleCheesePizza");}
}

class NyStyleClamPizza extends Pizza
{
    void declare(){sop("This is NyStyleClamPizza");}
    void bake(){sop("bake NyStyleClamPizza");}
}

class ChicagoStyleCheesePizza extends Pizza
{
    void declare(){sop("This is ChicagoStyleCheesePizza");}
    void box(){sop("box ChicagoStyleCheesePizza");}
}

class ChicagoStyleClamPizza extends Pizza
{
    void declare(){sop("This is ChicagoStyleClamPizza");}
    void prepare(){sop("prepare ChicagoStyleClamPizza");}
}
*/


public class FactoryPattern
{
    public static void main(String[] args)
    {

    }
}





