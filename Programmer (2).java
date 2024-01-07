class Employee
{
float salary=40000;
}
class Programmer extends Employee
{
int bonus=10000;
public static void main(String args[])
{
Programmer p=new Programmer();
System.out.println("Salaray of Employee is :"+p.salary);
System.out.println("Bonus of Employee is :"+p.bonus);
}
}