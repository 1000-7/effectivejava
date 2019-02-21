package info.unclewang.chapter02.e08;


import java.lang.ref.Cleaner;

/**
 * Java9的清除方法，代理了finalizer终结方法
 * 尽量不要用清除方法和终结方法
 * 不管可以用安全网的时候，用清除方法
 * 可以使用try-with-resources
 */
public class Room implements AutoCloseable {
    public static final Cleaner cleaner = Cleaner.create();

    private static class State implements Runnable {
        int num;

        public State(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println("cleaning room");
            num = 0;
        }
    }

    private final State state;

    private final Cleaner.Cleanable cleanable;

    public Room(int num) {
        this.state = new State(num);
        this.cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}
