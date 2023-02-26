public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);
        account.setDeposit(10);
        account.setWithdraw(2100);
        account.deposit(account.getDeposit());
        account.withdraw(account.getWithdraw());
        account.bloquer();
        System.out.println("Balance: " + account.getBalance());
    }
}
