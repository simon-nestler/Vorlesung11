public class App {
    public static void main(String[] args) throws Exception {
        Person max = new Person(25, "Max");
        Person lisa = new Person(23, "Lisa");

        Person maxKlon = max.erzeugeEinenKlon(); // Referenz & Objektkopie
        Person lisaKopie = lisa; // Referenzkopie

        max.setAge(26);
        lisa.setAge(24);

        System.out.println(max);
        System.out.println(lisa);
        System.out.println(maxKlon);
        System.out.println(lisaKopie);
    }
}
