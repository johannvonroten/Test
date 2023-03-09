public class Woman extends Model{
    String jupe, pull;
    int chaussures;

    public Woman (String name, int age, String jupe, String pull, int chaussures) {
        super(name, age);
        this.jupe = jupe;
        this.pull = pull;
        this.chaussures = chaussures;
    }
}

