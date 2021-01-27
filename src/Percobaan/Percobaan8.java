package Percobaan;

// Melakukan enumerasi pada Enum

enum Media {
    book,
    Music_CD,
    Music_Vinyl,
    Movie_VHS,
    Movie_DVD
}

public class Percobaan8 {
    public static void main(String[] args) {
        System.out.println(Percobaan8.getMedia("Book"));
        System.out.println(Percobaan8.getMedia(2));
    }

    public static Media getMedia(String s) {
        return Enum.valueOf(Media.class,s.toLowerCase());
    }

    public static Media getMedia(int n) {
        return  Media.values()[n];
    }
}
