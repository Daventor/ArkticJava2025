package com.ironhack.d1;

import com.ironhack.w2.d1.Director;
import com.ironhack.w2.d1.Movie;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {
    public static List<Movie> movieList;
    public static Director director;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll is the first executed method");

        Movie movie1 = new Movie("A Clockwork Orange", 130);
        Movie movie2 = new Movie("The Shining", 120);
        movieList = new ArrayList<>();

        movieList.add(movie1);
        movieList.add(movie2);
    }

    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach is executed before each test");

        director = new Director("Stanley", "Kubrick", movieList);
    }

    @AfterEach
    public void tearDown(){
        System.out.println("AfterEach is executed after each test");
    }

    @Test
    void getDirectorMoviesSize() {
        int directedMoviesSize = director.getDirectorMoviesSize();
        System.out.println("Directed movies size: " + directedMoviesSize);

        assertEquals(2, directedMoviesSize);
    }

    @Test
    void getFullName() {
        String fullname = director.getFullName();
        System.out.println("Fullname: " + fullname);

        assertEquals("Stanley Kubrick", fullname);
    }
}