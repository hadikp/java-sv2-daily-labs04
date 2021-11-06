package day04;

public class PlainMain {
    public static void main(String[] args) {
        Passenger peter = new Passenger("Hadik Péter", "FK452-1234", 4 );
        Passenger kriszta = new Passenger("Molnár Kriszta", "FK452-1235", 4 );
        Passenger janos = new Passenger("Törő János", "FK452-1236", 4 );

        Plain plain = new Plain();
        plain.addPassanger(peter);
        plain.addPassanger(kriszta);
        plain.addPassanger(janos);

        System.out.println("Összesen ennyi bőrönd került fel a gépre: " + plain.numberOfPackages());

    }
}
