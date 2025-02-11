package com.ironhack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Week 1 Day 2");

//      ARRAYS

        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(days);
        System.out.println(Arrays.toString(days));
        System.out.println(days[3]);
        System.out.println(days.length);
        System.out.println(days[days.length - 1]);

        String[] days2 = new String[3];

        String[] subjectArray = createSubjectArray();
        System.out.println(Arrays.toString(subjectArray));


//      LOOPS

        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }

        for(int i=0; i<subjectArray.length; i++){
            System.out.println(subjectArray[i]);
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <= 100 ; i++) {
            if(i % 2 == 0){
                evenNumbers[j] = i;
                j++;
            }
        }

        for (int i = evenNumbers.length-1; i >= 0; i--) {
            System.out.println(evenNumbers[i]);
        }

//      FOREACH LOOP
        for(String subject: subjectArray){
            System.out.println(subject);

        }


//      WHILE LOOP
        int counter = 0;
        while(counter < 10){
            System.out.println("Counter: " + counter);
            counter++;
        }

        boolean control = true;
        int i = 0;
        while(control){
            if(subjectArray[i].equals("Biology")){
                control = false;
                System.out.println("Founded: " + subjectArray[i]);
            }
            i++;
            if(i==subjectArray.length){
                control = false;
                System.out.println("Subject not found");
            }
        }

//      DO WHILE
        counter = 0;

        do{
            System.out.println("Counter: " + counter);
            counter++;
        }while(counter < 110);



//      ADD ELEMENTS TO ARRAY
        int[] numbers = {0,1,2,3,4};
        // numbers[5] = 5;

        int[] newNumbers = new int[6];
        for (int k = 0; k < numbers.length; k++) {
            newNumbers[k] = numbers[k];
        }
        newNumbers[5] = 5;


//      ARRAYLIST
        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Spain");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(1));
        countries.set(2, "Italy");
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove(2);
        System.out.println(countries);

        for (int k = 0; k < countries.size(); k++) {
            System.out.println(countries.get(k));
        }


//      MATH CLASS & CASTING

        System.out.println(Math.sqrt(64));
        System.out.println(Math.random());
        System.out.println((int)Math.pow(2, 5));
        System.out.println((int) 3.75);
        System.out.println(Math.ceil(3.75));


    }

    private static String[] createSubjectArray() {
        String[] subjects = new String[5];
        subjects[0] = "Math";
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";

        return subjects;
    }

    public static String getCountry(int index){
        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Spain");

        return countries.get(index);
    }
}
