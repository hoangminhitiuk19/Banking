
public class SavingsAccount extends Account
{

	SavingsAccount(UserInformation u)
	{
		super(u);
		setMinBalance(0.000);
		setWithdrawalLimit(100000,5000000);
		setBalance(0.000);
	}
	SavingsAccount(String an, String pin, double balance, UserInformation u)
	{
		this(u);
		super.setAccountNo(an);
		super.setPIN(pin);
		super.setBalance(balance);
	}

	void setMinBalance(double a)
	{
		minBalance=a;
	}
	
	void setWithdrawalLimit(double l, double h)
	{
		minWithdrawal=l;
		maxWithdrawal=h;
	}
	int getAccountType()
	{
		return Account.SAVINGS_ACCOUNT;
	}


}
