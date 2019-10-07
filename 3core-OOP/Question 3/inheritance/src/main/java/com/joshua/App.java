package com.joshua;
class Vehicle
{
    public void changeGears()
    {
        System.out.println("A vehicle has multiple gears.");
    }
    public void speedUp()
    {
        System.out.println("A vehicle has the ability to speed up.");
    }
    public void applyBrakes()
    {
        System.out.println("A vehicle has the ability to stop by applying it's brakes.");
    }
    public void fuel()
    {
        System.out.println("A vehicle runs on a specific type of fuel.");
    }
}
class Car extends Vehicle
{
public void ChangeGears()
{
    System.out.println("A car has 5 gears and a reverse gear.");
}
public void SpeedUp()
{
    System.out.println("A car has the ability to speed up.");
}
public void applyBrakes()
{
    System.out.println("A car has the ability to stop by applying it's brakes.");
}
public void fuel()
{
    System.out.println("A car runs on petrol.");
}
}

public class App 
{
    public static void main( String[] args )
    {
        Vehicle fordFiesta;
        fordFiesta = new Car();
        fordFiesta.changeGears();
        fordFiesta.speedUp();
        fordFiesta.applyBrakes();
        fordFiesta.fuel();
    }
}
