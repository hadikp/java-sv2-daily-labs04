package day01;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("A nyolcadik utas a halál", 1971);
        Actor actorVera = new Actor("Veronika Cartwright", 1950);
        Actor actorTom = new Actor("Tom Skerritt", 1933);
        Actor actorWeaver = new Actor("Sigourney Weaver", 1949);

        movie.addActor(actorVera);
        movie.addActor(actorTom);
        movie.addActor(actorWeaver);

        System.out.println("Ennyi színész járt a 20-as éveiben a film készítésekor: " + movie.actorsInTheirTwenties());


    }
}
