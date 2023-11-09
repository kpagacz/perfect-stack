package org.example;

import java.util.ArrayList;
import java.util.List;

public class PerfectStack {
    public static final List stack = new ArrayList();

    public void push(Integer integer) {
        stack.add(0, integer);
    }

    public Integer pop() {
        final var popped = stack.get(0);
        stack.remove(0);
        return popped;
    }
}
