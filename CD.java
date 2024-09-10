package persewaan;
//subclass
public class CD extends Product{
    private String artist;
    private int totalSong;
    private String label;

    public CD() {
        number = 10;
        name = "CD Selamat Siang";
        quantity = 0;
        price = 2000.0;
        artist = "Gilam";
        totalSong = 0;
        label = "nike";
    }

    public void print() {
        System.out.println("Total: "+number);
        System.out.println("Nama: "+name);
        System.out.println("Jumlah: "+quantity);
        System.out.println("Harga: "+price);
        System.out.println("Artist: "+artist);
        System.out.println("Lagu Total: "+totalSong);
        System.out.println("Label: "+label);
    }
}  

