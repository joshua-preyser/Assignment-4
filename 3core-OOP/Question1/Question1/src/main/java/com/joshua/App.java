package com.joshua;

 class Animal
{
    public void eat()
    {
        System.out.println("eating something");
    }
}
class Dog extends Animal{
   public void eat()
    {
        System.out.println("eats bones");
    }
}
class Puppy extends Dog
{
    public void eat()
    {
        System.out.println("drinks milk");
    }
}
class Cat extends Animal
{
   public void eat()
    {
        System.out.println("eats fish");
    }
}
class Kitten extends Cat
{
    public void eat()
    {
        System.out.println("drinks milk");
    }
}

public class App 
{
    public static void main( String[] args )
    {
        Animal d;
        d = new Dog();
        d.eat();
        d = new Puppy();
        d.eat();
        d = new Cat();
        d.eat();
        d = new Kitten();
        d.eat();
    }
}
    