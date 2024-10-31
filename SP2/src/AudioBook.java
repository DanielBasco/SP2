import java.time.Duration;

public class AudioBook extends Title{
    int durationMinutes;

    AudioBook(String title, String literatureType, int copies, int durationMinutes){
        super(title, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }

    double calculatePoints(){
        return (durationMinutes*0.5)*calculateLiteraturePoints()*copies;
    }

    double calculateLiteraturePoints(){
        double literaturePoints = 0; //Variable til literature point
        if (getLiteratureType().equals("BI") || getLiteratureType().equals("TE")){
            literaturePoints = 1.5; }
        if (getLiteratureType().equals("LYRIK")){
            literaturePoints = 3.0; }
        if (getLiteratureType().equals("SKØN")) {
            literaturePoints = 0.85; }
        if (getLiteratureType().equals("FAG")){
            literaturePoints = 0.5; }
        return literaturePoints;
    }


    

}
