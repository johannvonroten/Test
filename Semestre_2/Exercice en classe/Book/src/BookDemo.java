public class BookDemo {
    public static void main(String[] args) {
        Book one;

        one = new Book();

        one.setTitle ("Le Seigneur des anneaux");
        one.setAuthor ("J.R.R. Tolkien");

        System.out.println("Le livre est " + one.getTitle() + " de " + one.getAuthor());
    }
}
