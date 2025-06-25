package Java_Constructor_Class_Instance;

class BankAccount {
 public String accountNumber;
 protected String accountHolder;
 private double balance;

 public BankAccount(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 public double getBalance() {
     return balance;
 }

 public void setBalance(double amount) {
     if (amount >= 0) {
         this.balance = amount;
     } else {
         System.out.println("Invalid balance amount.");
     }
 }

 public void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: " + balance);
 }
}

class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
     super(accountNumber, accountHolder, balance);
     this.interestRate = interestRate;
 }

 public void displaySavingsInfo() {
     System.out.println("Savings Account Info:");
     System.out.println("Account Number (public): " + accountNumber);      // public access
     System.out.println("Account Holder (protected): " + accountHolder);   // protected access
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}

class Check2 {
 public static void main(String[] args) {
     BankAccount ba = new BankAccount("1234567890", "Alice", 15000);
     ba.displayAccountInfo();

     System.out.println();

     SavingsAccount sa = new SavingsAccount("9876543210", "Bob", 20000, 3.5);
     sa.displaySavingsInfo();

     System.out.println();

     System.out.println("Current Balance: " + sa.getBalance());
     sa.setBalance(22000);
     System.out.println("Updated Balance: " + sa.getBalance());
 }
}
