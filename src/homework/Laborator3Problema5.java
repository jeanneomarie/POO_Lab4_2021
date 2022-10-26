public class Laborator3Problema5 {
    public static void ordonare() {
        int i = 1, max = 49, min = 1;
        long s = 1;
        long masca = 0;
        while (i <= 6) {
            int a = (int) (Math.random() * (max - min) + min);
            masca = masca | (s << a); // setez bitul a
            System.out.print(a + " ");
            i++;
        }

        System.out.println();
        for (i = 0; i <= 64; i++) {
            if ((masca & (s << i)) != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        ordonare();
    }
}
