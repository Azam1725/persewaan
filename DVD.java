package persewaan;
//superclass
public class DVD extends Product {
    protected double length;
    protected String rating;
    protected String studio;

    public DVD() {
        number = 10;
        name = "CD Selamat Siang";
        quantity = 70;
        price = 200000;
        length = 500;
        rating = "NC-18";

    }
    
    public void print() {
        System.out.println("Total:" + number);
        System.out.println("Nama:" + name);
        System.out.println("Jumlah:" + quantity);
        System.out.println("Harga:" + price);
        System.out.println("Duras:" + length);
        System.out.println("Rating:" + rating);
        System.out.println("Studio:" + studio);
    }
}
