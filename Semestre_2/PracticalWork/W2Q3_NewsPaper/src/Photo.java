public class Photo {
    String name, photograph;
    int width, height;
    Photo[] tabPhoto;
    int cpt = 0;


    public Photo (String name, String photograph, int width, int height) {
        this.name = name;
        this.photograph = photograph;
        this.width = width;
        this.height = height;
    }

    public void addPhoto(Photo photo) {
        int cpt = 0;
        if (cpt >= tabPhoto.length) {
            System.out.println("Tableau photo (photo) plein");
        }
        else {
        tabPhoto[cpt] = photo;
        cpt++;
        }
    }

    public String toString() {

        return "Photo: " + name + " (" + width + "x" + height + ")";
    }
}
