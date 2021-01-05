
public class CurrentAccount extends Account
{
	public CurrentAccount(UserInformation u)
	{
		super(u);
		setMinBalance(0);
		setWithdrawalLimit(100000, 5000000);
		setBalance(0);
	}
	
	public CurrentAccount(String an, String pin,double balance, UserInformation u)
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

	void setWithdrawalLimit(double l,double h)
	{
		minWithdrawal=l;
		maxWithdrawal=h;
	}
	
	int getAccountType()
	{
		return Account.CURRENT_ACCOUNT;
	}
}
