public class Newspaper {
    String name, date;
    int nbPages, cptArticles,  cptAds;
    Ad[] tabAd;
    Article[] tabArt;
    int cptAd = 0;
    int cptArt = 0;


    public Newspaper (String name, String date, int nbPages, int cptArticles, int cptAds) {
        this.name = name;
        this.date = date;
        this.nbPages = nbPages;
        this.cptArticles = 0;
        this.cptAds = 0;
        this.tabArt = new Article[cptArticles];
        this.tabAd = new Ad[cptAds];


    }

    public void addArticle(Article article) {
        if (cptArt >= tabArt.length) {
            System.out.println("Tableau Article plein");
        }
        else {
            tabArt[cptArt] = article;
            cptArt++;
        }
    }

    public void addAd(Ad ad) {
        if (cptAd >= tabAd.length) {
            System.out.println("Tableau Ads plein");
        }
        else {
            tabAd[cptAd] = ad;
            cptAd++;
        }
    }

    public String toString () {
        return "Newspaper: " + name + " (" + date + ") " + cptArticles + " articles, " + cptAds + " ads";
    }
}
