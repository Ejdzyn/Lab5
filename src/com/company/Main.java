package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Stack stack = new Stack();
        for(int i = 0 ; i < (random.nextInt(5)+5);i++){
            stack.push(String.valueOf(random.nextInt(10)+1));
        }

        System.out.println(stack.get());

        System.out.println(stack.pop());

        System.out.println(stack.get());

        stack.push("55");

        System.out.println(stack.get());
    }
}
