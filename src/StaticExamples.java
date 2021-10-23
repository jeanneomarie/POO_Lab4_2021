// Metodele statice nu pot accesa variabile/metode ne-statice
/*
class StaticExamples {
    int size = 42;

    void go() {
    }

    static void doMore() {
        int x = size;
        go();
    }
}*/

// Variabilele si metodele ne-statice pot fi accesate doar de un obiect
/*
class StaticExamples {
    int size = 42;

    void go() {
    }

    static void doMore() {
        Ex f = new Ex();
        int x = f.size;
        f.go();
    }
}*/

// Metodele statice pot accesa doar variabile/metode care la rândul lor sunt statice
class StaticExamples {
    static int count;

    static void woo() {
    }

    static void doMore() {
        woo();
        int x = count;
    }
}