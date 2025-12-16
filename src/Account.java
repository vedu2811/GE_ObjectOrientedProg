public class Account {
    double balance=0.0;
    Account(double newBalance){
        if(newBalance>0.0){
            balance=newBalance;
            System.out.println("New Account Opened");
        }
    }
    public void credit(double creditAmount){
        if(creditAmount>0.0){
            balance+=creditAmount;
            System.out.println("Amount Credited");
            System.out.println("Current Balance: "+balance);
        }
    }
    public void debit(double debitAmount){
        if(balance-debitAmount>0.0){
            balance-=debitAmount;
            System.out.println("Amount debited");
            System.out.println("Current Balance: "+balance);
        }else{
            System.out.println("Debit amount greater than current balance");
            System.out.println("Current Balance: "+balance);
        }
    }
}

