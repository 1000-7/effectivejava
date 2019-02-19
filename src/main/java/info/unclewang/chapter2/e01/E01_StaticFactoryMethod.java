package info.unclewang.chapter2.e01;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Optional;
import java.util.Random;
import java.util.ServiceLoader;

public class E01_StaticFactoryMethod {
    /**
     * @param args
     * 下面这些都是经典的静态工厂方法
     */
    public static void main(String[] args) {
        Boolean.valueOf("a");
        Collections.emptyList();
        BigInteger.probablePrime(1, new Random());
        Optional.of(new Object());
        Object o = Array.newInstance(Object.class, 5);
        try {
            Files.newBufferedReader(Paths.get(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
