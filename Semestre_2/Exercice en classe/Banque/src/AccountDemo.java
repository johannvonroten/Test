public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account( 1000, 10, 200, 500);
        Save save = new Save( 1000, 10, 200, 500, 2, 0.1);
        Deposit deposit = new Deposit( 1000, 10, 0, 500, 0, 0.025);



        account.setBalance(1000);
        account.setDeposit(10);
        account.setWithdraw(200);
        account.setTranfert(500);

        account.deposit(account.getDeposit());
        account.withdraw(account.getWithdraw());
        account.tranfert(account.getTranfert());

        account.bloquer();

        System.out.println("Balance: " + account.getBalance());
    }
}
