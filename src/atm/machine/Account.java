package atm.machine;

public class Account 
{
	private int accountNo;
	private String password;
	private long balance;
	
	public Account(int id, String password, long balance) 
	{
		super();
		this.accountNo = id;
		this.password = password;
		this.balance = balance;
	}

	public int getId() 
	{
		return accountNo;
	}

	public void setId(int id) 
	{
		this.accountNo = id;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public long getBalance() 
	{
		return balance;
	}

	public void setBalance(long balance) 
	{
		this.balance = balance;
	}
	
	
	
}
