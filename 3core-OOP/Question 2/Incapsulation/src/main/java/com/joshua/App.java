package com.joshua;
class MyClass
{
    private String studentName;
    private int studentAge;
    public int getAge()
    {
        return studentAge;
    }
    public void setAge(int newAge)
    {
studentAge = newAge;
    }
    public String getName()
    {
        return studentName;
    }
    public void setName(String newName)
    {
        studentName = newName;
    }
}

public class App 
{
    public static void main( String[] args )
    {
        MyClass zach = new MyClass();
        zach.setName("Zachery");
        zach.setAge(21);

        System.out.println("The student name is "+zach.getName());
        System.out.println("The student age is "+zach.getAge());
    }
}
