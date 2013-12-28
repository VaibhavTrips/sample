
import Bankpa1.*;
public class SMCbank 
{
public static void main(String[] args)
{
	Account accObj1 = new Account("Rahul");
	accountlist.addacc(accObj1);
	
	Account accobj2 = new Account(5000, "Vaibhav");
	accountlist.addacc(accobj2);
	
	ATM ATMSession1 =  new ATM(1002);
	System.out.println(String.format("%d has balance: %d", 1002, ATMSession1.getCustomerbalance()));
	
	int newBalance = ATMSession1.withdrawamt(1000);
	System.out.println(String.format("%d has balance: %d", 1002,ATMSession1.getCustomerbalance()));

}
}
