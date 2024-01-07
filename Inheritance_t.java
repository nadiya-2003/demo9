class Student
{
String name="Kavya";
void eat()
{
System.out.println(" They are Eating");
}
}

class College extends Student
{
void display()
{
System.out.println(" Sub class of Super class B");
}
}


class Inheritance_t
{
public static void main(String args[])
{
Sub labrador=new Sub();
System.out.println(" "+labrador.name);
labrador.eat();
labrador.display();
}
}