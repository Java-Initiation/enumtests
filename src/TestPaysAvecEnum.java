import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPaysAvecEnum {

    public static void main(String[] args) {

        List<Pays> paysListe= new ArrayList<>(Arrays.asList(
                new Pays("France", 65, Continent.EUROPE),
                new Pays("Allemagne", 80, Continent.EUROPE),
                new Pays("Belgique",10,Continent.EUROPE),
                new Pays("Russie", 150, Continent.ASIE),
                new Pays("Chine",1 ,Continent.ASIE),
                new Pays("Indonésie", 220, Continent.OCEANIE),
                new Pays("Australie", 20, Continent.OCEANIE)));

        for (Pays pays : paysListe) {
            System.out.println(pays);
        }

        long nbEurope = paysListe.stream().filter(p -> p.getContinent() == Continent.EUROPE).count();
        long nbAsie = paysListe.stream().filter(p -> p.getContinent() == Continent.ASIE).count();
        long nbOceanie = paysListe.stream().filter(p -> p.getContinent() == Continent.OCEANIE).count();
        long nbAmerique = paysListe.stream().filter(p -> p.getContinent() == Continent.AMERIQUE).count();
        long nbAfrique = paysListe.stream().filter(p -> p.getContinent() == Continent.AFRIQUE).count();

        System.out.println("europe " + nbEurope);
        System.out.println("asie " + nbAsie);
        System.out.println("oceanie " + nbOceanie);
        System.out.println("amerique " + nbAmerique);
        System.out.println("afrique " + nbAfrique);


    }

}
