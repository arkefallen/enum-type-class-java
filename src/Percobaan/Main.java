package Percobaan;

// Percobaan 1 : Mengubah class ke Enum

// Menyimpan konstanta dalam bentuk class
/*class AllowedCreditCard {
    protected final String card;

    AllowedCreditCard(String str) {
        this.card = str;
    }

    public final static AllowedCreditCard VISA = new AllowedCreditCard("VISA");
    public final static AllowedCreditCard MASTER_CARD = new AllowedCreditCard("MASTER CARD");
    public final static AllowedCreditCard AMERICAN_EXPRESS = new AllowedCreditCard("AMERICAN EXPRESS");

    public String getName() {
        return this.card;
    }
}*/

// Menyimpan konstanta dalam bentuk enum
enum AllowedCreditCard {VISA,MATER_CARD,AMERICAN_EXPRESS};

public class Main {

    public static void main(String[] args) {

        // Mendeklarasi dengan class

	    //AllowedCreditCard myVisa = new AllowedCreditCard("VISA");
        //System.out.println(myVisa.getName());


        // Mendeklarasi dengan enum

        AllowedCreditCard myVisa = AllowedCreditCard.VISA;
        System.out.println(myVisa);
    }
}
