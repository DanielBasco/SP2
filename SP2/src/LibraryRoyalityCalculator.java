public class LibraryRoyalityCalculator {
    public static void main(String[] args) {

        //Opret mindst 1 forfatter med mindst 3 forskellige slags bøger(mindst 1 lydbog)
        Author lisbeth = new Author("Lisbeth");
        Title digtsamling = new PrintedBook("Violet", "LYRIK", 100, 32);
        Title underverdenen = new PrintedBook("Underverdenen", "SKØN", 300, 180);
        Title podcasten = new AudioBook("Rig?", "FAG", 100, 60);

        //Brug Author klassen addTitle til at tilføje titlerne til forfatter
        lisbeth.addTitle(digtsamling);
        lisbeth.addTitle(underverdenen);
        lisbeth.addTitle(podcasten);



        //Kald på calculateTotalPay | Bruger stringformat("%.2f) i min float metode til kun at
        // printe 2 decimaler i stedet for 3.

        System.out.println(lisbeth.getName()+": " +String.format("%.2f",lisbeth.calculateTotalPay() )+"kr");

    }
}
