class Author
{
String authorName;
int age;
String place;
Author(String authorName,int age,String place)
{
this.authorName=authorName;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author auther;    //aggregation

public Book(String name,int price,Author auther)
{
this.name=name;
this.price=price;
this.auther=auther;
}
public static void main(String args[])
{
Author auther=new Author("John",42,"USA");
Book b=new Book("Java for Beginner",800,auther);
System.out.println("Book Name:"+b.name);
System.out.println("Book Price:"+b.price);
System.out.println("-------------Auther Details---------------");
System.out.println("Auther Age:"+b.auther.age);
System.out.println("Auther place:"+b.auther.place);
}
}

