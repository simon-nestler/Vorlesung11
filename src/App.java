public class App {
    public static void main(String[] args) throws Exception {
        PersonenListe liste = new PersonenListe(
                new Person(25, "Max"),
                new Person(22, "Lisa"),
                new Person(40, "Sara"));

        PersonenListe listeKopie = liste.clone();
        listeKopie.swap();
        liste.wirWerdenAlleAelter();

        System.out.println(liste);
        System.out.println(listeKopie);
    }

    public void test() {
        Person max = new Person(25, "Max");
        Person lisa = new Person(23, "Lisa");

        Person maxKlon = max.clone(); // Referenz & Objektkopie
        Person lisaKopie = lisa; // Referenzkopie

        max.setAge(26);
        lisa.setAge(24);

        System.out.println(max);
        System.out.println(lisa);
        System.out.println(maxKlon);
        System.out.println(lisaKopie);
    }
}
