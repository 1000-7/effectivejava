package info.unclewang.chapter02.e04;


import java.util.Arrays;

/**
 * 工具类，设置成final+私有构造方法，不应该被初始化
 */
public final class UtilityClass {
    private UtilityClass() {

    }

    public static void main(String[] args) {
        Math.abs(1);
        Arrays.asList(new int[10]);
    }
}
