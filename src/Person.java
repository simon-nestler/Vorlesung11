public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person erzeugeEinenKlon() {
        return new Person(this.age, this.name);
    }

    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
}
