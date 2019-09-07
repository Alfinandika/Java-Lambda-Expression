package com.alfinandika.javalambdaexpression;

import java.util.function.*;

public class LambdaApp {
    public static void main(String[] args){

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

        Predicate<String> predicateLambda = (value)->{
            return value != null;
        };

        Predicate<String> predicateLambdaOneLine = (value)-> value != null;

        //
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        Function<String, String> functionLambda = (value)->{
            return value.toUpperCase();
        };

        Function<String, String> functionLambdaOneLine = (value)-> value.toUpperCase();

        //
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };

        Consumer<String> consumerLambda = (value)->{
            System.out.println("Value");
        };
        Consumer<String> consumerLambdaOneLine = (value)-> System.out.println("Value");

        //
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "alfin ganteng";
            }
        };

        Supplier<String> supplierLambda = ()->{
            return "alfin ganteng";
        };

        Supplier<String> supplierLambdaOneLine = ()-> "alfin ganteng";

        //
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };

        BiPredicate<String, String> biPredicateLambda = (s,s2)->{
            return s.equals(s2);
        };

        BiPredicate<String, String> biPredicateLambdaOneLine = (s,s2)-> s.equals(s2);
    }
}
