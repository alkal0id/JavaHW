package com.codespace.task;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class MyComparatorColor implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
