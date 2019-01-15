package com.stackroute.domain;

public class Movie {
    private Actor actor;
    public static final String MOVIE_MSG = "Welcome to Movie!!";

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public String getMessage() {
        return MOVIE_MSG;
    }
}
