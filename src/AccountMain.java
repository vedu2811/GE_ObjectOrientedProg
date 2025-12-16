public class AccountMain {
    public static void main(String[] args) {
        Account acc=new Account(5000);
        acc.credit(3000);
        acc.debit(150000);
        acc.debit(500);
    }
}
