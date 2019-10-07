package main.java.com.josh.bad;

public class Swimmer implements Athlete
{

	@Override
	public void compete() {
System.out.println("Zach is competing.")
    }
//unncecessary code
@Override
	public void highJump() {
System.out.println("Zach doesn't do the high jump.");
}
//unnecessary code
@Override
	public void longJump() {
System.out.println("Zach doesn't do the long jump.");
}

@Override
	public void swim() {
System.out.println("Zach is swimming.");
	}
    
}