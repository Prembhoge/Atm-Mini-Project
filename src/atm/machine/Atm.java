package atm.machine;
import java.util.Scanner;
public class Atm 
{
	Scanner sc=new Scanner(System.in);
	Account a;
	
	public void createAccount()
	{
		
		System.out.println("Enter Your Account Number");
		int id=sc.nextInt();
		System.out.println("Enter Your Password");
		String password=sc.next();
		System.out.println("Enter Amount");
		long amount=sc.nextLong();
		
		a=new Account(id,password,amount);
		System.out.println("Account Is Created");
	}
	
	public void deleteAccount()
	{
		System.out.println("Enter Your Account Number");
		int b=sc.nextInt();
		if(a==null)
		{
			System.out.println("Account Does Not Exists");
		}
		else
		{
			int c=a.getId();
			if(b!=c)
			{
				System.out.println("Incorrect Account Number");
			}
			else
			{
				a.setId(0);
				a.setPassword(null);
				a.setBalance(0);
				System.out.println("Account Is Deleted");
			}
		}
	}
		
	public void addMoney()
	{
		System.out.println("Enter Your Account Number");
		int c=sc.nextInt();
		if(a==null)
		{
			System.out.println("Account Does Not Exists");
		}
		else
		{
			int e=a.getId();
			if(c==e)
			{
				System.out.println("Enter Amount");
				long l=sc.nextLong();
				long b=a.getBalance();
				long sum=l+b;
				a.setBalance(sum);
				System.out.println("Updated Balance Is : " + sum);
			}
			else
			{
			System.out.println("Account Does Not Exists");
			}
		}
	}
		
	public void withdrawMoney()
	{
		System.out.println("Enter Your Account Number");
		int c=sc.nextInt();
		if(a==null)
		{
			System.out.println("Account Does Not Exists");
		}
		else
		{
			int e=a.getId();
			if(c==e)
			{
				System.out.println("Enter Amount");
				long l=sc.nextLong();
				long b=a.getBalance();
				if(l>b)
				{
					System.out.println("Enter Amount Less Than : " + b);
				}
				else
				{
					long sum=b-l;
					System.out.println("Updated Balance Is : " + sum);
					a.setBalance(sum);
				}
			}
			else
			{
			System.out.println("Account Does Not Exists");
			}
		}
	}
	
	public void cheakBalance()
	{
		System.out.println("Enter Your Account Number");
		int c=sc.nextInt();
		if(a==null)
		{
			System.out.println("Account Does Not Exists");
		}
		else
		{
			int e=a.getId();
			if(c==e)
			{
				long bal=a.getBalance();
				System.out.println("Your Balance Is : " + bal);
			}
			else
			{
				System.out.println("Account Does Not Exists");
			}
		}
	}
	
	public void updatePassword()
	{
		System.out.println("Enter Your Account Number");
		int b=sc.nextInt();
		if(a==null)
		{
			System.out.println("Account Does Not Exists");
		}
		else
		{
			int c=a.getId();
			if(b!=c)
			{
				System.out.println("Incorrect Account Number");
			}
			else
			{
				System.out.println("Enter New Password");
				a.setPassword(sc.next());
				System.out.println("Your New Password Is : " + a.getPassword());
			}
		}
	}
}
