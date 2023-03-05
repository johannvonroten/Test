public class Poupee {
    int taille;
    boolean[] isOpen = new boolean[10];


    public Poupee(int taille) {
        this.taille = taille;
    }

    public boolean enfermer(Poupee p) {
        if (p.taille < this.taille) {
           return true;
           } else {
            return false;
        }
    }

    public boolean open() {
        for (int i = 0; i < isOpen.length; i++) {
            if (isOpen[i] == false) {
                isOpen[i] = true;
                return true;
            }
        }
        return true;
    }

    public boolean close() {
        for (int i = 0; i < isOpen.length; i++) {
            if (isOpen[i] == true) {
                isOpen[i] = false;
                return false;
            }
        }
        return false;
    }

}
