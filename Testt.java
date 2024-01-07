//super refering to a immediate base class method

class A
{
void eat()
{
System.out.println("Straving.....");
}
}

class Animal extends A
{
void eat()
{
System.out.println("Eating.....");
}
}

class Dog extends Animal
{
void eat()
{
System.out.println("Eating.....");
}
void bark()
{
System.out.println("Barking.....");
}
void work()
{
super.eat();
bark();
}
}
class Testt
{
public static void main(String args[])
{
Dog d=new Dog();
d.work();
}
}
