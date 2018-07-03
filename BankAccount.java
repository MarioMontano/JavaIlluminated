import java.text.DecimalFormat;

public class BankAccount
{
    private long accountNumber;
    private double balance;
    private double interestEarned;
    private String type;
    
    private static int countBankAccounts = 0;
    
    public BankAccount( )
    {
        type = "unknown";
        countBankAccounts++;
    }
    
    public BankAccount( long startAccountNumber,
                        double startBalance,
                        double startInterestEarned,
                        String startType )
    {
     setAccountNumber( startAccountNumber );
     setBalance( startBalance );
     setInterestEarned( startInterestEarned );
     type = startType;
    }
    
    public long getAccountNumber( )
    {
        return accountNumber;
    }
    
    public double getBalance( )
    {
        return balance;
    }
    
    public double getInterestEarned( )
    {
        return interestEarned;
    }
    
    public String getType( )
    {
        return type;
    }
    
    public static int getCountBankAccounts( )
    {
        return countBankAccounts;
    }
    
    public void setAccountNumber( long newAccountNumber )
    {
        accountNumber = newAccountNumber;
    }
    
    public void setBalance( double newBalance )
    {
        balance = newBalance;
    }
    
    public void setInterestEarned( double newInterestEarned )
    {
        interestEarned = newInterestEarned;
    }
    
    public void setType( String newType )
    {
        type = newType;
    }
    
    public void deposit( double newDeposit )
    {
        if ( newDeposit >= 0.0 )
         balance += newDeposit;
        else
         System.err.println("Deposit amount must be positive." );    
    }
    
    public void withdraw( double newWithdraw )
    {
        if ( newWithdraw >= 0.0 && newWithdraw <= balance )
         balance -= newWithdraw;
        else
         System.err.println("Withdraw amount must be positive."
                            + "and cannot be greater than balance" );
    }
    
    public String toString( )
    {
        DecimalFormat moneyFormat = new DecimalFormat( "$###,###,###.00" );
        return "Account number: " + accountNumber
                + "; balance: " + moneyFormat.format( balance )
                + "; interest earned: " + moneyFormat.format( interestEarned )
                + "; type: " + type;
    }
    public boolean equals( Object o )
    {
        if ( ! ( o instanceof BankAccount ) )
            return false;
        else
        {
            BankAccount objBankAccount = ( BankAccount ) o;
            if ( type.equals( objBankAccount.type )
                && accountNumber == objBankAccount.accountNumber
                && Math.abs(balance - objBankAccount.balance )
                                      < 0.0001 
                && Math.abs(interestEarned - objBankAccount.interestEarned )
                                      < 0.0001)
                    return true;
            else
                    return false;
        }
    }
}
