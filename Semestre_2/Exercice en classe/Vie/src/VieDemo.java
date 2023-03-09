public class VieDemo {
    public static void main(String[] args) {

        Baby baby1 = new Baby("Miam", "Ouiiiiin");
        System.out.println("Le bébé mange: " + baby1.manger + " et il hurle " + baby1.hurler);

        Kid kid1 = new Kid("Ché délichieux ", " Aaaaaaah", "Je joue", "Je dors");
        System.out.println("L'enfant mange: " + kid1.manger + " et il hurle " + kid1.hurler + " et il joue " + kid1.jouer + " et il dort " + kid1.dormir);

        Ado ado1 = new Ado("C'est très bon", " Ouuaaaaaah", "Je joue ax jeux vidéos", "Je dors toute la journée", "Je sors", "Je me sèche les cheveux");
        System.out.println("L'ado mange: " + ado1.manger + " et il hurle " + ado1.hurler + " et il joue " + ado1.jouer + " et il dort " + ado1.dormir + " et il sort " + ado1.sortir + " et il se sèche les cheveux " + ado1.secherLesCheveux);

        Adult adult1 = new Adult("C'est délicieux", " Aaaaaah", "Je joue aux jeux vidéos", "Je dors toute la journée", "Je sors", "Je me sèche les cheveux", "Je travaille", "Je me repose");
        System.out.println("L'adulte mange: " + adult1.manger + " et il hurle " + adult1.hurler + " et il joue " + adult1.jouer + " et il dort " + adult1.dormir + " et il sort " + adult1.sortir + " et il se sèche les cheveux " + adult1.secherLesCheveux + " et il travaille " + adult1.travailler + " et il se repose " + adult1.seReposer);

        Senior senior1 = new Senior("C'est délicieux", " Aaaaaah", "Je joue aux jeux vidéos", "Je dors toute la journée", "Je sors", "Je me sèche les cheveux", "Je travaille", "Je me repose", "Je joue aux cartes");
        System.out.println("Le senior mange: " + senior1.manger + " et il hurle " + senior1.hurler + " et il joue " + senior1.jouer + " et il dort " + senior1.dormir + " et il sort " + senior1.sortir + " et il se sèche les cheveux " + senior1.secherLesCheveux + " et il travaille " + senior1.travailler + " et il se repose " + senior1.seReposer + " et il joue aux cartes " + senior1.JouerAuCartes);
    }
}
