package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie lotr = new Movie("Lord of the Rings", 200);
        Movie madMax = new Movie("Mad Max");

        System.out.println(harryPotter.getTitle() + " " + harryPotter.getDuration());
        System.out.println(harryPotter);
        System.out.println(lotr);
        System.out.println(madMax);
        System.out.println(harryPotter.IS_GOOD);

        Movie.displayAlert();


        HorrorMovie scream = new HorrorMovie("Scream", 90, true);
        scream.play();

        Movie candyman = new HorrorMovie("Candyman", 120, false);
        candyman.play();
    }
}
