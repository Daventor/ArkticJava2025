package com.ironhack.w1.d3;

public class Movie {
    private String title;
    private int duration;
    public final boolean IS_GOOD = true;

    public Movie() {
        title = "No title";
        duration = 0;
    }

    public Movie(String title) {
        this.title = title;
        duration = 90;
    }

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public void play(){
        System.out.println("Now playing: " + title);
    }

    @Override
    public String toString() {
        return "Movie: " + title + ", " + duration;
    }

    public static void displayAlert(){
        System.out.println("It´s illegal to pirate this movie");
    }
}
