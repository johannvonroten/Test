public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument one;

        one = new Instrument();

        one.setPlay(false);
        one.setTune(true);

        System.out.println(one.play);
        System.out.println(one.tune);
    }
}
