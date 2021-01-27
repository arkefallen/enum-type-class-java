package Percobaan;

// Enum dengan statement switch

enum OperatingSystems {
    Windows,
    UNIX,
    Linux,
    Macintosh
}

public class Percobaan6 {
    public static void main(String[] args) {
        OperatingSystems os;

        os = OperatingSystems.Windows;

        // Bisa menggunakan enum untuk control flow
        switch (os) {
            case Windows:
                System.out.println("My OS is Windows");
                break;
            case UNIX:
                System.out.println("My OS is UNIX");
                break;
            case Linux:
                System.out.println("My OS is Linux");
                break;
            case Macintosh:
                System.out.println("My OS is Macintosh");
                break;
            default:
                System.out.println("You don't have OS");
                break;
        }
    }
}
