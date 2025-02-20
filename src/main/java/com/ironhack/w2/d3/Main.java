package com.ironhack.w2.d3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("W2D3");

//      ENUM

        User user = new User("David");
        System.out.println(user);

        Category category = Category.GOLD;
        System.out.println("Category: " + category + " Points: " + category.POINTS);

        System.out.println(Category.values());
        for(Category c: Category.values()){
            System.out.println(c + " is in index " + c.ordinal() + " name: " + c.name());
        }

        System.out.println(Category.valueOf("GOLD").POINTS);


//      HASHMAP

        Map<String, String> nationalLeaders = new HashMap<>();

        nationalLeaders.put("India", "Ram Nath Kovind");
        nationalLeaders.put("Japan", "Shinzō Abe");
        nationalLeaders.put("Ecuador", "Lenín Moreno");
        nationalLeaders.put("Botswana", "Mokgweetsi Masisi");

        System.out.println(nationalLeaders);

        nationalLeaders.forEach((key, value) -> {
            System.out.println("Key: " + key + " / Value: " + value);
        });

        System.out.println(nationalLeaders.get("Japan"));


        Country india = new Country("India", "New Delhi", 1387297452, "Ram Nath Kovind");
        Country botswana = new Country("Botswana", "Gaborone", 2351627, "Mokgweetsi Masisi");
        Country japan = new Country("Japan", "Tokyo", 126476461, "Shinzō Abe");

        Map<String, Country> countryMap = new HashMap<>();

        countryMap.put("India", india);
        countryMap.put("Botswana", botswana);
        countryMap.put("Japan", japan);

        System.out.println(countryMap);
        System.out.println(countryMap.get("Japan"));
        System.out.println(countryMap.get("Japan").getCapital());

        for(Map.Entry<String, Country> entry: countryMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println(sumNumbers("dummyText", 1,2,3,4,5,6));
    }

    public static int sumNumbers(String name, int... numbers){
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result;
    }
}
