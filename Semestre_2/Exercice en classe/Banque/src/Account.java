public class Account {
    int balance, deposit, withdraw, tranfert;

    public void setBalance(int newBalance) {

        balance = newBalance;
    }

    public void setDeposit(int newDeposit) {
        deposit = newDeposit;
    }

    public void setWithdraw(int newWithdraw) {

        withdraw = newWithdraw;
    }

    public void setTranfert(int newTranfert) {
        tranfert = newTranfert;
    }

    public int getBalance() {

        return balance;
    }

    public int getDeposit() {

        return deposit;
    }

    public int getWithdraw() {

        return withdraw;
    }

    public int getTranfert() {
        return tranfert;
    }

    public void deposit(int amount) {

        balance = balance + amount;
    }

    public void withdraw(int amount) {

        balance = balance - amount;
    }

    public void tranfert(int amount) {
        balance = balance - amount;
    }

    public void bloquer() {
        if (balance <= -1000) {
            System.out.println("Votre compte est bloqué");
        }
    }
}
