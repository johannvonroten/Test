public class Ad {
    String author, title, text, company;
    int cptPhotos;
    Photo[] tabPhoto;
    int cpt = 0;

    public Ad(String author, String title, String text, String company, int cptPhotos) {
        this.author = author;
        this.title = title;
        this.text = text;
        this.company = company;
        this.cptPhotos = 0;
        this.tabPhoto = new Photo[cptPhotos];

    }

    public void addPhoto(Photo photo) {
        if (cpt >= tabPhoto.length) {
            System.out.println("Tableau Photo (art) plein");
        }
        else {
            tabPhoto[cpt] = photo;
            cpt++;
        }
    }

    public String toString () {
        return "Ad: " + title + " (" + cptPhotos + " photos)";
    }

}

