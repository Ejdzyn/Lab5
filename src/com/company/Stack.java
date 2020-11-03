package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stack implements StackOperations{

    private final List<String> STACK_OF_STRINGS = new ArrayList<>();

    @Override
    public List<String> get() {
        return STACK_OF_STRINGS;
    }

    @Override
    public Optional<String> pop() {
        if(STACK_OF_STRINGS.isEmpty()) {
            return Optional.empty();
        } else {
            String top = STACK_OF_STRINGS.get(0);
            STACK_OF_STRINGS.remove(0);
            return Optional.of(top);
        }
    }

    @Override
    public void push(String item) {
        STACK_OF_STRINGS.add(0,item);
    }

}
