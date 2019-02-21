package info.unclewang.chapter3.e11_hashcode;

import com.google.common.base.Objects;

public class HashCodeUse {
    private final short areaCode, prefix, lineNum;
    /**
     * 如果一个类不可变，又经常进行散列码的计算，开销很大
     * 可以存个变量，延迟初始化
     */
    private int hashCode;

    public HashCodeUse(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    /**
     * @return 这种性能一般，但是清晰，简单
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(areaCode, prefix, lineNum);
    }

    /**
     * @return 推荐，31的好处是 31 * i = (i<<5)-i，计算会被优化
     */
    public int hashCode1() {
        int result = hashCode;
        if (result == 0) {
            result = Short.hashCode(areaCode);
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode = result;
        }
        return result;
    }
}
