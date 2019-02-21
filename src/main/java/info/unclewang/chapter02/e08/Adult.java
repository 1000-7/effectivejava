package info.unclewang.chapter02.e08;

/**
 *
 */
public class Adult {
    public static void main(String[] args) {
        good();
        bad();
    }

    public static void good() {
        try (Room room = new Room(100)) {
            System.out.println("goodbye");
        }
    }

    public static void bad() {
        Room room = new Room(100);
        System.out.println("goodbye");
        System.gc();
    }
}
