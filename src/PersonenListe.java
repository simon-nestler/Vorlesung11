public class PersonenListe implements Cloneable {
    private Person erstePerson, zweitePerson, drittePerson;

    public PersonenListe(Person erstePerson, Person zweitePerson, Person drittePerson) {
        this.erstePerson = erstePerson;
        this.zweitePerson = zweitePerson;
        this.drittePerson = drittePerson;
    }

    public void wirWerdenAlleAelter() {
        erstePerson.setAge(erstePerson.getAge() + 10);
        zweitePerson.setAge(zweitePerson.getAge() + 1);
        drittePerson.setAge(drittePerson.getAge() + 1);
    }

    public void swap() {
        Person temp = erstePerson;
        erstePerson = drittePerson;
        drittePerson = temp;
    }

    @Override
    public PersonenListe clone() {
        try {
            return (PersonenListe) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "PersonenListe [erstePerson=" + erstePerson + ", zweitePerson=" + zweitePerson + ", drittePerson="
                + drittePerson + "]";
    }

}
