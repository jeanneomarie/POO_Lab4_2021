// Metodele statice nu pot accesa variabile/metode ne-statice
//public class StaticExamples {
//    int size = 42;
//
//    void go() {
//    }
//
//    static void doMore() {
//        int x = size;
//        go();
//    }
//
//     public static void main(String[] args) {
//        doMore();
//    }
//}

// Variabilele si metodele ne-statice pot fi accesate doar de un obiect
//public class StaticExamples {
//    int size = 42;
//
//    void go() {
//    }
//
//    static void doMore() {
//        StaticExamples staticExamples = new StaticExamples();
//        int x = staticExamples.size;
//        staticExamples.go();
//    }
//
//    public static void main(String[] args) {
//        doMore();
//    }
//}

// Metodele statice pot accesa doar variabile/metode care la rândul lor sunt statice
public class StaticExamples {
    static int count;

    static void woo() {
    }

    static void doMore() {
        woo();
        int x = count;
    }

    public static void main(String[] args) {
        doMore();
    }
}
