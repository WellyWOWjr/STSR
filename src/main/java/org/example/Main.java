package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> list = IntStream.range(0, 10)
                .map(i -> new Random().nextInt(100))
                .boxed()
                .toList();

        list.stream()
                .filter(n -> n > 30)
                .forEach(System.out::println);
    }
}