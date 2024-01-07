// super is used to refer immediate parent class instance variable

class Animal
{
String color="White";
}

class Dog extends Animal
{
String color="Black";
void print()
{
System.out.println(color);
System.out.println(super.color);
}
}

class Test1
{
public static void main(String args[])
{
Dog d=new Dog();
d.print();
}
}