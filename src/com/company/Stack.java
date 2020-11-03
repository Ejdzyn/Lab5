package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stack implements StackOperations{

    private final List<String> STACKOFSTRINGS = new ArrayList<>();

    @Override
    public List<String> get() {
        return STACKOFSTRINGS;
    }

    @Override
    public Optional<String> pop() {
        if(STACKOFSTRINGS.isEmpty()) return Optional.empty();
        else {
            String top = STACKOFSTRINGS.get(0);
            STACKOFSTRINGS.remove(0);
            return Optional.of(top);
        }
    }

    @Override
    public void push(String item) {
        STACKOFSTRINGS.add(0,item);
    }

}
