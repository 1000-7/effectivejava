package info.unclewang.chapter2.e07;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 清空过期引用
 * 如果不加这一句，会导致一个对象被无意识的保留起来了，elements[size] = null;
 * 不必过度害怕，碰见这种类自己需要扩展内存
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
//        elements[size] = null;
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly doubling the capacity
     * each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
