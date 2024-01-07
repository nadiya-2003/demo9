class Animal
{
void eat()
{
System.out.println("The Dog is Eating");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("The Dog is Barking");
}
}
class Inheritance
{
public static void main(String args[])
{
Dog d=new Dog();
d.bark();
d.eat();
}
}