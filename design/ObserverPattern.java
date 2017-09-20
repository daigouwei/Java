/**
 *观察者模式
 *定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 */

import java.util.ArrayList;

public class ObserverPattern
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(11.2f, 32.4f, 12);
        weatherData.setMeasurements(0f, 0.00f, 0);
    }
}


interface Subject
{
    public abstract void registerObserver(Observer o);
    public abstract void removeObserver(Observer o);
    public abstract void notifyObservers();
}

interface Observer
{
    public abstract void update(float temp, float humidity, float perssure);
}

interface DisplayElement
{
    public abstract void display();
}



class WeatherData implements Subject
{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float perssure;

    WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if(i >= 0)
            observers.remove(i);
    }

    public void notifyObservers()
    {
        for(int i = 0; i < observers.size(); i++)
        {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, perssure);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float perssure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.perssure = perssure;

        measurementsChanged();
    }
}



class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float perssure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display()
    {
        System.out.println("temperature = "+temperature+", humidity = "+humidity);
    }
}
