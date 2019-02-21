package info.unclewang.chapter03.e13_clone;

import info.unclewang.chapter02.e07.Stack;

public class StackClone extends Stack {
    @Override
    protected Object clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements;//赋值数组的方法
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
