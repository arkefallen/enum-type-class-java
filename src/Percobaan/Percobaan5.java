package Percobaan;

// Menentukan sendiri nilai konstanta dari enum

enum CoffeeSize3 {
    SMALL(5), MEDIUM(7), LARGE(10);

    private int size;

    CoffeeSize3(int ml) {
        this.size = ml;
    }

    public int getSize() {
        return size;
    }
}

public class Percobaan5 {
    public static void main(String[] args) {
        CoffeeSize3 mediumCup = CoffeeSize3.MEDIUM;

        System.out.println(mediumCup.getSize());
    }
}


