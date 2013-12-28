package Bankpa1;

public class Account 
{
	private int balance;
	private static  int accnumcount=1000;
	private String holdname;
	private int accnum;

	public int getbalance()
	{
		return this.balance;
	}

	public String getname()
	{
		return this.holdname;
	}
	public int accountnumber()
	{
		return this.accnum;
	}

	public Account(String name)
	{
		this(0,name);
	}
	public Account(int startingbal,String name)
	{
		accnumcount++;
		holdname=name;
		accnum=accnumcount;
		balance=startingbal;
	}
	public int deposite(int amt)
	{
		if(amt>0)
		{
			balance=balance+amt;

		}
		return balance;
	}
	public int withdraw(int amt)
	{
		if (amt<=balance)
		{
			balance=balance-amt;
		} return balance;
	}
}