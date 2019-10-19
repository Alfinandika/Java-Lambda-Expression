package com.alfinandika.javalambdaexpression;

public class LambdaInterfaceApp {

    public static void main(String[] args){
        ArgsConsumer<String> consumer = (arg) -> {
            for(String value : arg){
                System.out.println(value);
            }
        };

        ArgsConsumer<String> consumerOneLine = (arg) -> printAll(arg);
        ArgsConsumer<String> consumerOneMine2 = LambdaInterfaceApp::printAll;

        consumerOneLine.consume("Alfi", "Andika", "Pratama");
    }

    public static void printAll(String[] args){
        for(String value : args){
            System.out.println(value);
        }
    }

    @FunctionalInterface
    interface ArgsConsumer<T>{
        void consume(T... arg);
    }
}
