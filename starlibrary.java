import mypack1.*;// Packages ,Exception user and inbuilt && Thread
import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class booking extends Thread
{
	public void run()
	{
		try
		{
			if(payment.ch==1)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("UG Book");
				System.out.println("Enter seven digit Card Number");
				long cn=sc.nextLong();
				System.out.println("Valid Thru MMYY");
				int y=sc.nextInt();
				System.out.println("Enter three Digit secret number CVV");
				int cvv=sc.nextInt();
				System.out.println("Payment Processing.......");
			}
			else 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("PG Book");
				System.out.println("Enter seven Digit Card Number");
				long cn=sc.nextLong();
				System.out.println("Enter the Valid Thru MMYY");
				int y=sc.nextInt();
				System.out.println("Enter three Digit secret number CVV");
				int cvv=sc.nextInt();
				System.out.println("Payment Processing.........");
			}
				
		}
		catch(InputMismatchException ex)
		{
			ex.printStackTrace();
			System.out.println("Invalid Input");
		}
	}
}
public class starlibrary
{
	String name;
	String nameofthebook;
	librarian Librarian; //AGGREGATION 
	protected String collegename;
	starlibrary(String collname)
	{
		collegename=collname;
	}
	starlibrary(String name,String nameofthebook,librarian Librarian)
	{
			this.name=name;
			this.nameofthebook=nameofthebook;
			this.Librarian=Librarian;
	}
	
	public static void main(String args[])
	{
		String name;
		String nameofthebook;
		librarian Librarian = new librarian("Harish","M8875");
		Scanner sc=new Scanner(System.in);
		register.intro s1 = new register.intro();    
		register obj[] = new register[1];
		register.change();                
		s1.show();
		obj[0]=new register(args[0],88985533); //Command line argument
		System.out.println("************************************************");
		System.out.println("Enter your Name");
		name=sc.nextLine();
		System.out.println("Enter type of book Theory book or Partical book");
		nameofthebook=sc.nextLine();
		System.out.println("Enter your phone number");
		Scanner s=new Scanner(System.in);
		int n=10;
		String a[]=new String[n];
		try
		{

		int i;
		for (i=0;i<n;i++);
		{
			a[i]=s.nextLine();
		}
		}
		catch(ArrayIndexOutOfBoundsException z)
		{
			System.out.println("ARRAY OUT OF BOUND");
		}
		starlibrary br= new starlibrary(name,nameofthebook,Librarian);
		
		System.out.println("*************COLLECTION CLASS******************");
		List<String> items=new ArrayList<>();                                      
		System.out.println("Enter your book Name");
		String v=sc.nextLine();
		items.add("Java");
		items.add("C++");
		items.add("Python");
		items.add("unix");
		items.add("database");
		items.add("advance database");
		items.add("blockchain");
		items.add("bitcoin");
		items.add("security Management");
		items.add("cyber security");
		if((Collections.binarySearch(items,v))<0)
		{
			System.out.println(v+" Name of the book  is not AVAILABLE IN library ,,Plaese enter another book name");
		}
		else
		{
			System.out.println(v+" Book is booked for Mr/Ms "+name);
		}
		System.out.println("Other books available in our library are");
		for(int r=0;r<items.size();r++)
		{
			System.out.print(items.get(r)+"  ");
		}
		System.out.println("                           ");
		
		System.out.println("************************************************");
		obj[0].display("online");
		System.out.println("Librarian Name: "+br.Librarian.librarianname);
		System.out.println("Librarian ID: "+br.Librarian.librarianID);
		System.out.println("***********************LAB 5*******************************");
		long startTime = System.currentTimeMillis();
		stringbuffer obj2=new stringbuffer();
		obj2.concatwithstring();
		System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms"); //string time
		startTime = System.currentTimeMillis();
		obj2.concatwithstringbuffer();
		System.out.println("Time taken by Concating with StringBuffer class: "+(System.currentTimeMillis()-startTime)+"ms"); //string buffer time
		System.out.println("*************************INTERFACE************");
		int c1;
		System.out.println("Enter 1 for UG Student  && Enter 2 For PG Student");
		c1=sc.nextInt();
		details det=new details(c1);
		det.student();
		det.book();
		System.out.println("*****************************LAB10**************");
		payment p=new payment();
		booking b=new booking();
		p.get_details();
		p.cards();
		b.start();
	}
}
class register extends starlibrary
{
	static String registerman = "Arun";       
	static void change()              
	{
		registerman="Jai";
	}
	static 
	{ 
		System.out.println(".......VANAKAM.............");
	}     
	register(String collname, int registerid)
	{
		super(collname);
		int regid=registerid;
	}
	register(String collname, int registerid, int password)    
	{
		super(collname);
		int p=password;
		int regid= registerid;
	}
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	void display()
	{
		System.out.println(collegename);
		System.out.println(dtf.format(now));
	}
	void display(String mode)              
	{
		System.out.println("\n"+"In charge of library : "+registerman+"\n"+"College Name : "+collegename);
		System.out.println(dtf.format(now));
		System.out.println("Booked by : "+mode);
	}
	static class intro     
	{
		void show()
		{
			System.out.println("Welcoome to starlibrary system");
		}
	}
}
class librarian//Aggregation
{
  
  String librarianname;
  String librarianID;
  
  librarian(String librarianname, String librarianID) 
  {
    this.librarianname = librarianname;
    this.librarianID = librarianID;
  }
}
interface department //Interface
{
	public void student(); 
	public void book(); 
}
class details implements department
{
	int opt;
	details(int c1)
	{
		opt=c1;
	}
	public void student() 
	{
		if(opt==1)
		{
			System.out.println("Deparment:UG student");
		}
		if(opt==2)
		{
			System.out.println("Deparment:PG student");
		}
	
	}
	public void book()
	{
		System.out.println("Next go to payment");
	}
}
