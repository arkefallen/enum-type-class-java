package Latihan;

enum Colors {
    BLUE,
    GREEN,
    YELLOW,
    RED
}
public class Latihan2 {
    public static void main(String[] args) {
        int x = 0;
        Colors c = Colors.GREEN;

        switch (c) {
            case BLUE:
                System.out.print(c);
                break;
            case RED:
                System.out.print(c);
                break;
            case GREEN:
                System.out.print(c);
                break;
            case YELLOW:
                System.out.print(c);
                break;
            default:
                System.out.print("BlackWhite");
                break;
        }
        System.out.println(" Picture Perfect");
    }
}
