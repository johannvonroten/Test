public class Deposit extends Save {

    public Deposit (int balance, int deposit, int withdraw, double tranfert, int frais, double interest) {
        super(balance, deposit, withdraw, tranfert, frais, interest);
    }

    public void withdraw(int amount) {
        System.out.println("You can't withdraw money from a deposit account");
    }

    public void tranfert(double amount) {
        if (tranfert > 10000) {
            tranfert = (tranfert*0.015)+tranfert;
        }
        }
    }
