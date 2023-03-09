public class Account {
    double balance;
    int deposit;
    int withdraw;
    double tranfert;

    public Account(int balance, int deposit, int withdraw, double tranfert) {
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.tranfert = tranfert;
    }


    public void setBalance(double newBalance) {

        balance = newBalance;
    }

    public void setDeposit(int newDeposit) {
        deposit = newDeposit;
    }

    public void setWithdraw(int newWithdraw) {

        withdraw = newWithdraw;
    }

    public void setTranfert(double newTranfert) {
        tranfert = newTranfert;
    }

    public double getBalance() {

        return balance;
    }

    public int getDeposit() {

        return deposit;
    }

    public int getWithdraw() {

        return withdraw;
    }

    public double getTranfert() {
        return tranfert;
    }

    public void deposit(int amount) {

        balance = balance + amount;
    }

    public void withdraw(int amount) {

        balance = balance - amount;
    }

    public void tranfert(double amount) {
        balance = balance - amount;
    }

    public void bloquer() {
        if (balance <= -1000) {
            System.out.println("Votre compte est bloqué");
        }
    }
}
