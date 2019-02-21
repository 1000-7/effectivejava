package info.unclewang.chapter3.e12_toString;

import info.unclewang.chapter3.e10_equals.PhoneNumber;

/**
 * @7C21 是对象计算得到的散列码的无符号十六进制表示法
 */
public class PhoneNumberTest {
    public static void main(String[] args) {
        short a = 2;
        PhoneNumber phoneNumber = new PhoneNumber(a, a, a);
        System.out.println(phoneNumber);
        System.out.println("info.unclewang.chapter3.e10.PhoneNumber@7c21");

    }
}
