public class LockDemo {
    public static void main(String[] args) {

        Key key = new Key(1234);
        Key key2 = new Key(5000);
        Key key3 = new Key(134);

        Lock lock = new Lock(1234);
        Lock lock2 = new Lock(134);
        key.open(key);
        key.close(key);


    }
}
