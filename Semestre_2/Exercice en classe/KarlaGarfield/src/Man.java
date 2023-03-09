public class Man extends Model{
    String pantalon, pull;
    int shoes;

    public Man (String name, int age, String pantalon, String pull, int shoes) {
        super(name, age);
        this.pantalon = pantalon;
        this.pull = pull;
        this.shoes = shoes;
    }
}
