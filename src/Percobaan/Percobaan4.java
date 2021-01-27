package Percobaan;

// Tidak bisa mendeklarasikan enum di dalam method

public class Percobaan4 {
    public static void main(String[] args) {
        // Illegal
        //enum  CoffeeSize {SMALL, MEDIUM, LARGE};
        Coffee bigCup = new Coffee();

        // Illegal
        //bigCup.size = Percobaan4.CoffeeSize.LARGE;
    }
}
