public class Article {
    String author, title, text;
    int cptPhotos;
    Photo[] tabPhoto;
    int cpt = 0;


    public Article (String author, String title, String text, int cptPhotos) {
        this.author = author;
        this.title = title;
        this.text = text;
        this.cptPhotos = cptPhotos;
        this.tabPhoto = new Photo[cptPhotos];
    }

        public void addPhoto(Photo photo) {
            int cpt = 0;
            if (cpt >= tabPhoto.length) {
                System.out.println("Tableau Photo (art) plein");
            }
            else {
                tabPhoto[cpt] = photo;
                cpt++;
            }
        }

    public String toString () {

        return "Article: " + title + " (" + cptPhotos + " photos)";
    }
}
