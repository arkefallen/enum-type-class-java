package Latihan;

enum Animals {
    DOG("Woof"),
    CAT("Meow"),
    FISH("Burble");

    String sound;

    Animals(String s) {
        this.sound = s;
    }
}

public class Latihan5 {
    static Animals a;

    public static void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}
