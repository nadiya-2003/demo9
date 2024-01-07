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
class Babydog extends Dog
{
void weep()
{
System.out.println("The Dog is Weeping");

}
} 

class Inheritance1
{
public static void main(String args[])
{
Babydog  b =new Babydog();
b.bark();
b.eat();
b.weep();
}
}