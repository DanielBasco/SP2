public abstract class Title {
    private String title;
    private String literatureType;
    int copies;
    double rate = 0.067574;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    //For at få adgang til literatureType laver jeg en getLiteratureType metode selvom den ikke var inde på PlantUML
    public String getLiteratureType() {
        return literatureType;
    }


    double calculateRoyalty(){
        return calculatePoints() * rate;
     }
     //Abstract og bliver ikke brugt i denne klasse
    abstract double calculatePoints();
    abstract double calculateLiteraturePoints(

    );

}
