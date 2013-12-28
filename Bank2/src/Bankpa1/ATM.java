package Bankpa1;

public class ATM 
{
	private int accnum;
	private Account customerAccount;
	
	public ATM(int accountNumber)
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
}
