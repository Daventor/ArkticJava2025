package com.ironhack.w2.d1;

import java.util.List;

public class Director {
    private String name;
    private String lastname;
    private List<Movie> directedMovies;

    public Director(String name, String lastname, List<Movie> directedMovies) {
        this.name = name;
        this.lastname = lastname;
        this.directedMovies = directedMovies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Movie> getDirectedMovies() {
        return directedMovies;
    }

    public void setDirectedMovies(List<Movie> directedMovies) {
        this.directedMovies = directedMovies;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", directedMovies=" + directedMovies +
                '}';
    }

    public int getDirectorMoviesSize(){
        return directedMovies.size();
    }

    public String getFullName(){
        return name + " " + lastname;
    }
}
