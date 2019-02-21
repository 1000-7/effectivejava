package info.unclewang.chapter02.e03;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Elvis implements Serializable {
    private static class SingletonHolder {
        private static final Elvis INSTANCE = new Elvis();
    }

    public static final Elvis getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private Elvis() {
        init();
    }

    private void init() {

    }

    /**
     * @return
     * @throws ObjectStreamException
     * 单例序列化后，反序列化保持一致
     *
     */
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return SingletonHolder.INSTANCE;
    }
}