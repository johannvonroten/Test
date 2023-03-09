public class Save  extends Account {
        int frais;
        double interest;

public Save (int balance, int deposit, int withdraw, double tranfert, int frais, double interest) {
    super(balance, deposit, withdraw, tranfert);
    this.frais = frais;
    this.interest = interest;
}

public void setFrais(int newFrais) {
    frais = newFrais;
}
public void getFrais() {
    frais = frais;
}
public void setInterest(double newInterest) {
    interest = newInterest;
}
public void getInterest() {
    interest = interest;
}
public void Frais() {
    balance = balance - frais;
}
public void Interest() {
    balance = (double) (balance + (balance * 0.1));
}
}
