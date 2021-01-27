package Latihan;

public class Latihan1 {
    enum Size {small, medium, large,  Xlarge};

    public static void main(String[] args) {
        for (Size s : Size.values() ) {
            if ( s == Size.small )
                System.out.println("Small ");
            else if ( Size.medium.equals(s))
                System.out.println("Medium ");
            else if ( s == Size.large )
                System.out.println("Large");
            else if ( s.equals("Xlarge "))
                System.out.println("Xlarge ");
            /* else if ( s == "Xlarge ") // Error
                System.out.println("Xlarge"); */
        }
    }
}
