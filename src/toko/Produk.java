package toko;


public class Produk {

    private String namaProduk;
    private double hargaProduk;


    public Produk(String namaProduk, double hargaProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }


    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }


    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }


    public void displayInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp." + hargaProduk);
    }
}
