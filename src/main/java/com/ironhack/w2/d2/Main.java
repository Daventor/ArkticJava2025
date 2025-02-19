package com.ironhack.w2.d2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

//      CHECKED EXCEPTIONS

        readFile("myFile.txt");

//      UNCHECKED EXCEPTIONS

        String name = null;
        printLength(name);

//      THROWS

        int[] sampleArray = null;

        try {
            printArray(sampleArray);
        }catch (NullPointerException e){
            System.out.println("Array cannot be null");
        }

//      THROWING EXCEPTIONS
        int a = 900_000_000;
        int b = 400_000_000;
        long longProduct;

        try {
            int product = multiply(a, b);
            System.out.println(product);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("Using long version...");
            longProduct = multiply((long) a, (long) b);
            System.out.println(longProduct);
        }finally {
            System.out.println("End multiply execution (Finally)");
        }
        System.out.println("End multiply execution");


//      CREATE OUR OWN EXCEPTIONS
        try {
            int result = divide(123, 0);
        }catch (DivideByZeroException e){
            System.out.println(e.getMessage());
        }

//      EQUALS, HASH, TO-STRING

        Book book1 = new Book(1234, "Harry Potter", "J.K. Rowling", 1997);
        Book book2 = new Book(5678, "Harry Potter", "J.K. Rowling", 1997);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println("book1 == book2: " + book1.equals(book2));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }

    private static int divide(int a, int b) throws DivideByZeroException {
        if(b == 0){
            throw new DivideByZeroException("You cannot divide by zero");
        }
        return a/b;
    }

    private static long multiply(long a, long b) {
        return a * b;
    }

    private static int multiply(int a, int b) {
        int product = a * b;

        if(product / a != b){
            throw new IllegalArgumentException("Product of input is too great for int");
        }

        return product;
    }

    private static void printArray(int[] numArray) throws NullPointerException {
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }

    private static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        }catch (NullPointerException e){
            System.out.println("String cannot be null");
        }catch (Exception e){
            System.out.println("Something was wrong");
        }
    }

    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        }catch(FileNotFoundException e){
            System.out.println("The file doesn´t exist");
            System.out.println(e.getMessage());
        }
    }
}
