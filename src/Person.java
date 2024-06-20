public class Person implements Cloneable {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person erzeugeEinenKlon() throws CloneNotSupportedException {
        Person neu = (Person) this.clone();
        return neu;
    }

    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
}
