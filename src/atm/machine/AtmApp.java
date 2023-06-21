package atm.machine;

import java.util.Scanner;

public class AtmApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Atm a=new Atm();
		for(;;)
		{
			System.out.println("Select One Option" + "\n" + "1. Create Account" + "\n" + 
								"2. Delete Account" + "\n" + "3. Add Money" + "\n" + 
								"4. Withdraw Money" + "\n" + "5. Cheak Balance" + "\n" + 
								"6. Update Password" + "\n" + "7. Exit");
			
			switch(sc.nextInt())
			{
				case 1:
				a.createAccount();
				break;
				
				case 2:
				a.deleteAccount();
				break;
				
				case 3:
				a.addMoney();
				break;
				
				case 4:
				a.withdrawMoney();
				break;
				
				case 5:
				a.cheakBalance();
				break;
				
				case 6:
				a.updatePassword();
				break;
				
				case 7:
				System.out.println("Transaction Completed");
				System.exit(0);
			}
		}
	}
}
