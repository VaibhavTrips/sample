package Bankpa1;


public class accountlist
{
	private static Account[] Acount=new Account[5];
	private static int arraycount=0;

	public static void addacc(Account obj)
	{
		if(arraycount< 5)
		{
			Acount[arraycount] = obj;
			arraycount++;
		}
	}
	public static Account getAccDetails(int accnum)
	{
		Account obj = null;

		for(int i = 0 ; i < 10; i++)
		{
			if(Acount[i].accountnumber() == accnum)
			{
				obj = Acount[i];
				break;
			}
			else
			{
				continue;
			}
		}

		return obj;
	}


}
