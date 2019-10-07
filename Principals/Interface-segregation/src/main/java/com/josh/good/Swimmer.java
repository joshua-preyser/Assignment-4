package main.java.com.josh.good;

public class Swimmer implements SwimmingAthlete {

    @Override
    public void swim()
    {
        System.out.println("Zach is Swimming.");
    }

    @Override
    public void compete()
    {
    System.out.println("Zach is competing.");
    }
    
}