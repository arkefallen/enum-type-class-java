package Percobaan;

// Fungsi pada Enum

enum Apple {
    A(1), B(2), C(3), D(4), E(5);

    private int total;

    Apple(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }
}

public class Percobaan7 {
    public static void main(String[] args) {
        Apple oneApple = Apple.A;

        // Memanggil method pada Enum
        System.out.println(oneApple.getTotal());
    }
}
