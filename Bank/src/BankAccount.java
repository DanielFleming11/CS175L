	/**
	   A bank account has a balance and a mechanism for
	   applying interest or fees at the end of the month.
	*/
	public class BankAccount
	{
	   private double balance;
	   private double interestPct;
	   private double inter;

	   /**
	      Constructs a bank account with zero balance.
	   */
	   public BankAccount(double amount, double interest)
	   {
	      balance = amount;
	      interestPct = interest;
	   }

	   /**
	      Makes a deposit into this account.
	      @param amount the amount of the deposit
	   */
	   public void deposit(double amount)
	   {
	      balance = balance + amount;
	   }

	   /**
	      Makes a withdrawal from this account, or charges a penalty if
	      sufficient funds are not available.
	      @param amount the amount of the withdrawal
	   */
	   public void withdraw(double amount)
	   {
		  if (balance < amount) {
			  System.out.println("Insufficient Funds to support withdrawal");
		  }
		  else {
	      balance = balance - amount;
	   }
	   }
	   /**
	      Gets the current balance of this bank account.
	      @return the current balance
	   */
	   public double calcInterest()
	   {
		  inter = balance * interestPct;
		  return inter;
	   }
	   
	   public double getBalance()
	   {
		  balance = balance + (balance * interestPct);
	      return balance;
	   }
	}

