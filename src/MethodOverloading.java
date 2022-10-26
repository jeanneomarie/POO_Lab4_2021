public class MethodOverloading {
    public static int test(int i, int j) {
        return i + j;
    }

    public static int test(int i, byte j) {
        return i + j;
    }

    public static void main(String[] args) {
        // static     => we can call the method directly on that class
        // not static => we must have an object of that class in order to call the method on it
        System.out.println(test(2, 3));
        System.out.println(test(2, Byte.MAX_VALUE));
    }
}
