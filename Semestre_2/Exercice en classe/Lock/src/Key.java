public class Key {
    int reference;

    public Key(int reference) {
        this.reference = reference;
    }

    public String isOpen() {
        return "The lock is open";
    }

    public String isClosed() {
        return "The lock is closed";
    }

    public void open(Key key) {
        if (key.reference == this.reference) {
            System.out.println("The lock is open");
        } else {
            System.out.println("The lock is closed");
        }
    }

    public void close(Key key) {
        if (key.reference == this.reference) {
            System.out.println("The lock is open");
        } else {
            System.out.println("The lock is closed");
        }
    }
}

