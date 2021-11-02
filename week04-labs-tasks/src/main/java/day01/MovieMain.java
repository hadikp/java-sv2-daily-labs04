package day01;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("A nyolcadik utas a halál", 1971);
        Actor actorVera = new Actor("Veronika Cartwright", 1950);
        Actor actorTom = new Actor("Tom Skerritt", 1933);

        movie.addActor(actorVera);

    }
}
