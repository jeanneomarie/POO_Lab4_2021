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

    public static void modify1(Person person1) {
        person1 = new Person("Modified Name");
        System.out.println("Method modify1(Person person1) printed inside: " + person1.getName()); // Modified Name
    }

    public static void modify2(Person person2) {
        person2.setName("Modified Name");
        System.out.println("Method modify2(Person person2) printed inside: " + person2.getName()); // Modified Name
    }

    public static int changeNumber(int number) {
        number = 11;
        System.out.println(number);// 11
        return number;
    }

    public static void main(String[] args) {
        Person p = new Person("Initial Person");

        modify1(p);
        System.out.println("Method modify1(Person person1):" + p.getName()); // Initial Name

        modify2(p);
        System.out.println("Method modify2(Person person2):" + p.getName()); // Modified Name

        int number = 10;
        number = changeNumber(number); // 11
        System.out.println(number); // 10
    }
}
