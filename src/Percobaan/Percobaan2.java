package Percobaan;

// Mendeklarasikan enum diluar class

enum CoffeeSize {SMALL, MEDIUM, LARGE};

class Coffee {
    CoffeeSize size;
}

public class Percobaan2 {
    public static void main(String[] args) {
        // Instansiasi
        Coffee smallCup = new Coffee();

        // Meng-assign konstanta enum ke properti
        smallCup.size = CoffeeSize.SMALL;

        System.out.println(smallCup.size);
    }
}
