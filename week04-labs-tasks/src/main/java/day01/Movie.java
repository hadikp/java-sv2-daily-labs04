package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String filmTitle;
    private int year;
    private List<Actor> actorsList = new ArrayList<>();

    public Movie(String filmTitle, int year) {
        this.filmTitle = filmTitle;
        this.year = year;
    }

    public void addActor(Actor actor) {
        actorsList.add(actor);
    }

    public int  actorsInTheirTwenties() {
        int counter = 0;
        for (Actor a: actorsList) {
            if ((year - a.getYearOfBirth()) <= 30) {
                counter++;
            }
        }
        return counter;
    }

}
