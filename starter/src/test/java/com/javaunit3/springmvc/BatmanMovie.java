package com.javaunit3.springmvc;

public class BatmanMovie implements Movie{

    @Override
    public String getTitle() {
        return "Batman: The Dark Knight";
    }

    @Override
    public String getMaturityRate() {
        return "PG-13";
    }

    @Override
    public String getGenre() {
        return "Action";
    }
}
