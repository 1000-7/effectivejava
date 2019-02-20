package info.unclewang.chapter2.e06;

import java.util.regex.Pattern;

/**
 * 不要创建多余对象
 * 有些对象创建的成本高，比如正则表达式，但又重复利用
 * 又比如返回一个Map的keySet，可以事先在Map里放一个Set来存所有的key
 * 尽量使用基本数据类型，不要使用装箱基本类型
 */
public class RomanNumerals {
    public static final Pattern ROMAN = Pattern.compile("adsas");
    static boolean isRomanNumeralsBad(String s) {
        return s.matches("asdf");
    }

    static boolean isRomanNumeralsGood(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        String bad = new String("sdlkfhsa");
        String good = "sfjdl";
    }
}
