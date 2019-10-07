package main.java.com.josh.good;

public class Jumper implements JumpingAthlete {

    @Override
    public void highJump() {
    System.out.println("Daniel is doing the high jump.");
    }

    @Override
    public void longJump()
    {
    System.out.println("Daniel is doing the long jump.");
    }

    @Override
    public void compete() {
    System.out.println("Daniel is competing.");
    }
    
}