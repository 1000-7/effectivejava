package info.unclewang.chapter03.e13_clone;

public class GoodClone {
    private String a;
    private String b;
    private String c;

    public GoodClone() {
    }

    /**
     * @param goodClone 拷贝构造方法
     */
    public GoodClone(GoodClone goodClone) {
        this.a = goodClone.a;
        this.b = goodClone.b;
        this.c = goodClone.c;
    }

    public static GoodClone newInstance(GoodClone goodClone) {
        GoodClone that = new GoodClone();
        that.a = goodClone.a;
        that.b = goodClone.b;
        that.c = goodClone.c;
        return that;
    }
}
