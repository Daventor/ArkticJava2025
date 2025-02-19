package com.ironhack.w1.d1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World !!");

// Primitive Data Types
        byte myByte = 127;
        short myShort = 1000;
        int myInt = 99999;
        long myLong = 500_000_000_000L;
        double myDouble = 3.456;
        float myFloat = 1.234f;
        boolean myBool = true;
        char myChar = 'a';

        myInt = 1234;
        System.out.println(myInt);

        String myString = "Hello to everyone!!";
        System.out.println(myString);

        System.out.println("Char data: " + myChar);

// Operators
        int number = 10;
        double doubleNumber = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(doubleNumber / 3);
        System.out.println(number % 3);

        number++;
        number += 2;
        number -= 2;
        number *= 2;
        number /= 2;

        number = (number + ((number * 4) / number)) * 14;

// Conditionals
        number = 10;

        // <, >, <=, >=, ==, !=
        // &&, ||, ^

        if(number == 0){
            System.out.println("Number is equal to 0");
        }else if(number >= 100 && number <= 1000){
            System.out.println("Number is bigger or equal to 100 and less than 1000");
        }else{
            System.out.println("Number is another value");
        }

        if(number >= 10 || number <= -10){
            System.out.println("Number has at least 2 digits");
        }

        if(number % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");

        boolean myCondition = false;
        if(!myCondition) System.out.println("Condition is false");
        else System.out.println("Condition is true");

//      Switch

        int day = 6;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default: {
                System.out.println("Weekend");
                break;
            }
        }

//      Modern switch
        switch (day){
            case 1 -> {
                System.out.println("Method 2:" + "Monday");
            }
            case 2 -> System.out.println("Method 2:" + "Tuesday");
            case 3 -> System.out.println("Method 2:" + "Wednesday");
            case 4 -> System.out.println("Method 2:" + "Thursday");
            case 5 -> System.out.println("Method 2:" + "Friday");
            default -> System.out.println("Method 2:" + "Weekend");
        }

//  Ternary operator
        double grade = 3.5;

        String status = grade >= 5 ? "passed" : "failed";
        System.out.println(status);

//  String Methods
        String address = "Fake Street, 123";

        System.out.println("Address: " + address);
        System.out.println("Address length: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toUpperCase().replace("E", "-"));

        String address2 = "Fake Street, 123";

        if(address.equals(address2)) System.out.println("Address are equals !!");


//      Methods
        myMethod();
        myMethod();

        System.out.println(getInfo(1));


//      Wrappers
        Integer myNum = 100;
        System.out.println(myNum);

    }




    public static void myMethod(){
        System.out.println("\nThis");
        System.out.println("is");
        System.out.println("Inside");
        System.out.println("myMethod");
    }

    public static String getInfo(int option){
        String output = "";

        if(option == 1) output = "My name is David";
        else if(option == 2) output = "This is an Ironhack bootcamp";
        else output = "Option" + option + " provides no info";

        return output;
    }
}
