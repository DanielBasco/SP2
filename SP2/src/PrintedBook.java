public class PrintedBook extends Title {

    private int pages;

    PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
    }

    double calculatePoints(){
    return pages*calculateLiteraturePoints()*copies;
    }
    double calculateLiteraturePoints(){
        double literaturePoints = 0; //Variable til literature point
    if (getLiteratureType().equals("BI") || getLiteratureType().equals("TE")){
        literaturePoints = 3.0; }
    if (getLiteratureType().equals("LYRIK")){
        literaturePoints = 6.0; }
    if (getLiteratureType().equals("SKØN")) {
        literaturePoints = 1.7; }
    if (getLiteratureType().equals("FAG")){
        literaturePoints = 1.0; }
return literaturePoints;
    }
}


