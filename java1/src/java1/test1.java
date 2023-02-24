package java1;
import java.util.Scanner;

class Book{
	String title,author;
	public Book(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
}

public class test1 {
	public static void main(String[] args) {
	String a="a";
	String b="b";
	String c="a";
	String d=new String("a");
	String e=new String("b");
	String f=new String("a");
	System.out.print(a);
	System.out.print(b);
	System.out.println(c);
	System.out.print(d);
	System.out.print(e);
	System.out.println(f);
	c=a.concat("aa");
	f=d.concat("aa");
	System.out.print(a);
	System.out.print(b);
	System.out.println(c);
	System.out.print(d);
	System.out.print(e);
	System.out.println(f);
	}
}
