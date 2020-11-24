import mypack.*;//package
import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import java.util.Scanner;
class booking extends Thread
{
	public void run()
	{
		try
		{
			if(payment.ch==1)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Harish");
				System.out.println("8 digit Card Number");
				long cn=sc.nextLong();
				System.out.println("Valid Thru MMYY");
				int y=sc.nextInt();
				System.out.println("CVV");
				int cvv=sc.nextInt();
				System.out.println("Payment Processing.......");
			}
			else 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Arun kumar");
				System.out.println("8 Digit Card Number");
				long cn=sc.nextLong();
				System.out.println("Valid Thru MMYY");
				int y=sc.nextInt();
				System.out.println("3 Digit CVV");
				int cvv=sc.nextInt();
				System.out.println("Payment Processing.........");
			}
				
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Invalid Input");
		}
	}
}
public class starlibrary
{
	String name;
	String nameofthebook;
	int bookid;
	librarian Librarian; //AGGREGATION 
	protected String collegename;
	starlibrary(String collname)
	{
		collegename=collname;
	}
	starlibrary(String name,String nameofthebook,int b,librarian Librarian)
	{
			this.name=name;
			this.nameofthebook=nameofthebook;
			bookid=b;
			this.Librarian=Librarian;
	}
    
	public void getvenueid()
	{
		try
		{
		if(bookid==1)
		{
			System.out.println("Course Book");
		}
		else if(bookid==2)
		{
			System.out.println("Practical Book");
		}
		else
		{
			throw new location();
		
		}
		}
		catch (location e)
		{
			System.out.println("WRONG INPUT");
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		String name;
		String nameofthebook;
		int v;
		librarian Librarian = new librarian("Harish","M8875");
		Scanner sc=new Scanner(System.in);
		register.intro s1 = new register.intro();    
		register obj[] = new register[1];
		register.change();                
		s1.show();
		obj[0]=new register(args[0],67678779); //Command line argument
		System.out.println("************************************************");
		System.out.println("Enter ur name");
		name=sc.nextLine();
		System.out.println("Enter Name of the book");
		nameofthebook=sc.nextLine();
		System.out.println("Enter your phone number");
		Scanner s=new Scanner(System.in);
		int n=10;
		String a[]=new String[n];
		try                            ///Exception handling
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
		
		System.out.println("Enter 1 for Course Book && Enter 2 for Pratical book");
		v=sc.nextInt();
		starlibrary br= new starlibrary(name,nameofthebook,v,Librarian);
		br.getvenueid();
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
		System.out.println("ENTER 1 for UG student && ENTER 2 For PG student");
		c1=sc.nextInt();
		details det=new details(c1);
		det.student();
		det.book();
	}
}

class register extends starlibrary    
{
	static String registerman = "joy";       
	static void change()              
	{
		registerman="raj";
	}
	static 
	{ 
		System.out.println(".......HAI.............");
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
		System.out.println("\n"+"In charge of library: "+registerman+"\n"+"College Name : "+collegename);
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
class librarian   //Aggregation
{
  
  String librarianname;
  String librarianID;
  
  librarian(String librarianname, String librarianID) {
    this.librarianname = librarianname;
    this.librarianID = librarianID;
  }
}
interface department ////////////////Interface
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
        else{
        
            System.out.println("Wrong Input");
        }
	}
	public void book()
	{
		System.out.println("Book successfully booked");
	}
}
