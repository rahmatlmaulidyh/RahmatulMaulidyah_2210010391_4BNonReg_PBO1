
package toko;

public class Kustomer {

    private String namaKustomer;


    public Kustomer( String namaKustomer) {
        this.namaKustomer = namaKustomer;
    }


    public String getNamaKustomer() {
        return namaKustomer;
    }



    public void setNamaKustomer(String namaKustomer) {
        this.namaKustomer = namaKustomer;
    }


    public void displayInfo() {
        System.out.println("Nama Kustomer: " + namaKustomer);
    }
}
