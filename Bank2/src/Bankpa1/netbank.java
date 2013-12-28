package Bankpa1;


public class netbank 
{

	private int accnum;
	private Account customerAccount;

	public netbank(int accountNumber)
	{
		this.accnum = accountNumber;
		customerAccount = accountlist.getAccDetails(this.accnum);
	}

	public int getCustomerbalance()
	{
		return customerAccount.getbalance();
	}

	public int withdrawamt(int amt)
	{
		return customerAccount.withdraw(amt);
	}

	public int depositamt(int amt)
	{
		return customerAccount.deposite(amt);
	}
}
