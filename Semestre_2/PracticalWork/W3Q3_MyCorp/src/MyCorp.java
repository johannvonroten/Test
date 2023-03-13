import java.awt.print.Book;
import java.lang.invoke.DelegatingMethodHandle$Holder;

public class MyCorp {
    public static void main(String[] args) {

        Chief_Executive_Officier ceo = new Chief_Executive_Officier("J.Smith", "Top Management", "Sales & Procurement & Finance");
        System.out.println(ceo);

        Finance finance = new Finance("M.Jaquet", "Division Directors", "Chief Executive officer", "Accounting");
        System.out.println(finance);

        Procurement procurement = new Procurement("F.Vernier", "Division Directors", "Chief Executive officer", "Asia & EU + USA");
        System.out.println(procurement);

        Sales sales = new Sales("V.Jaton", "Division Directors", "Chief Executive officer", "Magazines & Books");
        System.out.println(sales);

        Accounting accounting = new Accounting("A.Bernard", "Division Directors", "Chief Executive officer");
        System.out.println(accounting);

        EU_USA eu_usa = new EU_USA("A.Bernard", "Division Directors", "Chief Executive officer", "EU & USA");
        System.out.println(eu_usa);

        Asia asia = new Asia("A.Bernard", "Division Directors", "Chief Executive officer");
        System.out.println(asia);

        Books books = new Books("A.Bernard", "Division Directors", "Chief Executive officer", "Books");
        System.out.println(books);

        Magazines magazines = new Magazines("A.Bernard", "Division Directors", "Chief Executive officer");
        System.out.println(magazines);

    }
}
