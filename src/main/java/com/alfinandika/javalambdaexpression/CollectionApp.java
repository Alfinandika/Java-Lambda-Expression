package com.alfinandika.javalambdaexpression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CollectionApp {

    public static void main(String[] args){
        List<String> list = createList();

//        for(String value : list){
//            System.out.println(value);
//        }
//
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        list.forEach((value) -> System.out.println(value));


        Map<String, String> map = createMap();

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+" : "+s2);
            }
        });

        map.forEach((key, value) -> System.out.println(value+" : "+key));
        map.forEach(CollectionApp::printEntry);


    }

    public static void printEntry(String key, String value){
        System.out.println(key+" : "+value);
    }

    public static List<String> createList(){
        return Arrays.asList("Alfin", "Andika", "Pratama");
    }

    public static Map<String, String> createMap(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "Alfin");
        map.put("b", "Andika");
        map.put("c", "Pratama");

        return map;
    }

}
