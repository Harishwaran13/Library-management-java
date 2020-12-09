package mypack1;
import java.util.*;
import java.lang.*;
interface details
{
	void get_details();
}
interface card
{
	void cards();
}
public class payment implements details
{
	public static int ch;
	Scanner s=new Scanner(System.in);
	public void cards()
	{
		System.out.println("Select \n 1.Debit Card \n 2.Credit card");
		int am=s.nextInt();
	}
	public void get_details()
	{
		System.out.println("BOOK rates \n 1.UG BOOK --350 \n 2.PG BOOK --500");
		ch=s.nextInt();
	}
}