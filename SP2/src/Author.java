import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Title> title;

    Author(String name){
        this.name = name;
        this.title = new ArrayList<>();
    }

    void addTitle(Title title){
        this.title.add(title);
    }
    ArrayList<Title> getTitles(){
        return this.title;
    }

    public float calculateTotalPay(){
        float total = 0;
        for (Title title : title) {
            total += title.calculateRoyalty();
        }
    return total;
    }

    public String getName(){
        return this.name;
    }

}
