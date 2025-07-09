package Java_keywords;

public class Bank_Account {
	static String bankName="HDFC bank";
	final int accountNumber;
	String accountHolderName;
	static int totalAccounts=0;
	Bank_Account(String accountHolderName,int accountNumber)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		totalAccounts++;
	}
	static void getTotalAccounts()
	{
		System.out.println(totalAccounts);
	}
	void display()
	{
		if (this instanceof Bank_Account) {
            System.out.println("Bank: " + bankName);
            System.out.println("Name: " + accountHolderName);
            System.out.println("Account No: " + accountNumber);
        }
	}
	public static void main(String[] args) {
		Bank_Account acc1 = new Bank_Account("Siddhi", 12345);
		acc1.display();
		Bank_Account.getTotalAccounts();
	}
}
