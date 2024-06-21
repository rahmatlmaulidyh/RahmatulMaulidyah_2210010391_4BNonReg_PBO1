
package toko;
public class Transaksi extends Produk {
    private Kustomer kustomer;
    private int jumlah;


    public Transaksi(String namaProduk, double hargaProduk, Kustomer kustomer, int jumlah) {
        super(namaProduk, hargaProduk); // Memanggil constructor superclass
        this.kustomer = kustomer;
        this.jumlah = jumlah;
    }


    public Kustomer getKustomer() {
        return kustomer;
    }

    public int getJumlah() {
        return jumlah;
    }


    public void setKustomer(Kustomer customer) {
        this.kustomer = customer;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

 
    @Override
    public void displayInfo() {
        super.displayInfo();
        kustomer.displayInfo();
        System.out.println("Kuantitas: " + jumlah);
        System.out.println("Total Harga: Rp." + (super.getHargaProduk() * jumlah));
    }
}
