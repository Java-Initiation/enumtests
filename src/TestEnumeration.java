public class TestEnumeration {

    public static void main(String[] args) {

        for (Saison saison : Saison.values()) {
            System.out.println(saison);
        }

        System.out.println(Saison.valueOf("ETE"));

        Saison hiver = Saison.getSaisonFromLibelle("Hiver");
        System.out.println(hiver);

    }

}
