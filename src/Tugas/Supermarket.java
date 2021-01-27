package Tugas;

enum Apple {
    Malang(5000),
    Granny_Smith(6000),
    Pink_Lady(7000),
    Golden_Delicious(8000),
    Red_Delicious(9000),
    Gala(10000);

    private int price;

    Apple(int p) {
        this.price = p;
    }

    public int getPrice() {
        return price;
    }

    public String getDeskripsi(Apple a) {
        String apel;
        switch (a) {
            case Gala :
                apel = "apel ini enak";
                break;
            case Pink_Lady:
                apel = "apel ini warna pink";
                break;
            case Malang:
                apel = "apel ini bukan dari Malang";
                break;
            case Granny_Smith:
                apel = "apel ini pernah juara Granny Awards";
                break;
            case Red_Delicious:
                apel = "apel ini warna merah";
                break;
            case Golden_Delicious:
                apel = "apel ini warna nya ga begitu emas";
                break;
            default:
                apel = "kamu gaada apel";
                break;
        }
        return apel;
    }
}

public class Supermarket {
    public static void main(String[] args) {
        System.out.println("Kami menjual :");
        for (Apple myApple : Apple.values() ) {
            System.out.println("\nApel " + myApple + " dengan harga " + myApple.getPrice());
            System.out.println("Deskripsi : " + myApple.getDeskripsi(myApple));
        }
    }
}
