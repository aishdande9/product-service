package problems;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aish",9000.00);

        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withDraw(2000);
        System.out.println(account.getBalance());
    }
}
