class Animal
{
public void eat()
{
System.out.println("I can eat");
}
}

class Dog extends Animal
{
public void eat()
{
System.out.println("I  eat dog food");
}
public void bark()
{
System.out.println("I can Bark");
}
}
class Test
{
public static void main(String args[])
{
Dog d=new Dog();
d.eat();
d.bark();
}
}
