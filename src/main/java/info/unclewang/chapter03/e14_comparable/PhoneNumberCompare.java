package info.unclewang.chapter03.e14_comparable;

import info.unclewang.chapter03.e10_equals.PhoneNumber;

import java.util.Comparator;

public class PhoneNumberCompare extends PhoneNumber implements Comparable<PhoneNumber> {

    public PhoneNumberCompare(short areaCode, short prefix, short lineNum) {
        super(areaCode, prefix, lineNum);
    }

    /**
     * 这一段本来应该写在PhoneNumber类里的
     *
     */
    private static final Comparator<PhoneNumber> COMPARATOR = Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode).thenComparingInt(pn -> pn.prefix);


    @Override
    public int compareTo(PhoneNumber o) {
        return COMPARATOR.compare(this, o);
    }
}
