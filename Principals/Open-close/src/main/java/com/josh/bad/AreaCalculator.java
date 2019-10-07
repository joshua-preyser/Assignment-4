package main.java.com.josh.bad;

public class AreaCalculator
{
public double calcRectangle(Rectangle r)
{
        return r.length * r.width;
}
public double calcCircle(Circle c)
{
    return (22/7) * c.radius * c.radius;
}
}