package com.alfinandika.javalambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApp {

    public static void main(String[] args){

        Stream<String> names = newStream();

        //with Anonymours Class
//        names.map(new Function<String, String>() {
//
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        }).forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //with Lambda
        names.map((value) -> value.toUpperCase()).forEach((value) -> System.out.println(value));

        //simple lambda
//        names.map(String::toUpperCase).forEach(System.out::println);

        List<String> fruits = newList();

        //with lambda
        fruits.stream()
                .map((value) -> value.toUpperCase())
                .filter((value) -> value.startsWith("A"))
                .forEach((value) -> System.out.println(value));

        //with simple lambda
//        fruits.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);



    }

    public static Stream<String> newStream(){
        return Stream.of("Alfin", "Andika", "Pratama");
    }

    public static List<String> newList(){
        return Arrays.asList("Apel,", "melon", "alpukat", "jeruk", "belimbing");
    }

}

