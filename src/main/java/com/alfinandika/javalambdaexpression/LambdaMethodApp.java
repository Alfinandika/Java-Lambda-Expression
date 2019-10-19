package com.alfinandika.javalambdaexpression;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaMethodApp {

    public static void main(String[] args){
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return LambdaMethodApp.isNotNull(s);
            }
        };
        Predicate<String> predicateLambda = (value)-> LambdaMethodApp.isNotNull(value);
        Predicate<String> predicateLambdaMoreSimple = LambdaMethodApp::isNotNull; //syarat : harus manggil method dan parameternya sama

        //
        Predicate<String> predicate2 = new Predicate<String>() {
            @Override
            public boolean test(String s1) {
                return s1.isEmpty();
            }
        };
        Predicate<String> predicate2Lambda = (value) -> value.isEmpty();
        Predicate<String> predicate2LambdaMoreSimple = String::isEmpty;

        //
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {

            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        BiPredicate<String, String> biPredicateLambda = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> biPredicateLambdaMoreSimple = LambdaMethodApp::isEquals;

        //
        String hello = "hello";
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return hello.concat(s);
            }
        };
        Function<String, String> functionLambda = (s) -> hello.concat(s);
        Function<String, String> functionLambdaMoreSimple = hello::concat;

        //
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Consumer<String> consumerLambda = (s) -> System.out.println(s);
        Consumer<String> consumerLambdaMoreSimple = System.out::println;


    }

    public static boolean isNotNull(String value){
        return value != null;
    }

    public static boolean isEquals(String value1, String value2){
        return value1.equals(value2);
    }
}
