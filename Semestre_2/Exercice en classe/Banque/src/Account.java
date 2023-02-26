public class Account {
    int balance, deposit, withdraw;

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public void setDeposit(int newDeposit) {
        deposit = newDeposit;
    }

    public void setWithdraw(int newWithdraw) {
        withdraw = newWithdraw;
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

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public void bloquer() {
        if (balance <= -1000) {
            System.out.println("Votre compte est bloqué");
        }
    }
}
