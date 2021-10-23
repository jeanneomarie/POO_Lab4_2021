package models;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void modify1(Person p) {
        p = new Person("Modified Name");
        System.out.println("Method modify1(Person p) printed inside: " + p.getName()); //Modified Name
    }

    public static void modify2(Person p) {
        p.setName("Modified Name");
        System.out.println("Method modify2(Person p) printed inside: " + p.getName());//Modified Name
    }

    public static void main(String[] args) {
        Person p = new Person("Initial Person");
        modify1(p);
        System.out.println("Method modify1(Person p):" + p.getName()); // Initial Name
        modify2(p);
        System.out.println("Method modify2(Person p):" + p.getName()); // Modified Name
    }
}