package Percobaan;

// Mendeklarasikan enum di dalem class

class Coffee2 {
    enum CoffeeSize {SMALL, MEDIUM, LARGE};
    CoffeeSize size;
}

public class Percobaan3 {
    public static void main(String[] args) {
        // Instansiasi
        Coffee2 mediumCup = new Coffee2();

        // Assign konstanta value ke properti
        mediumCup.size = Coffee2.CoffeeSize.MEDIUM;
    }
}
