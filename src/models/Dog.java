public class Dog {
    static int dogCount;

    public Dog() {
        dogCount += 1;
    }

    public static void main(String[] args) {
        new Dog();
        new Dog();
        new Dog();
        System.out.println("Dog count is now " + Dog.dogCount);
    }
}