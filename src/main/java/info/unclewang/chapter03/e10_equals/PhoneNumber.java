package info.unclewang.chapter03.e10_equals;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * 重写equals方法必须重写hashcode方法
 */
public class PhoneNumber {
    public final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ":" + val);
        }
        return (short) val;
    }


    /**
     * @param o
     * @return
     * guava生成的就是标准的
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode &&
                prefix == that.prefix &&
                lineNum == that.lineNum;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("areaCode", areaCode)
                .add("prefix", prefix)
                .add("lineNum", lineNum)
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(areaCode, prefix, lineNum);
    }
}
