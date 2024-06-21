# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penjualan produk pada suatu toko menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa berapa banyak transaksi yang akan dilakukan,nama kustomer, nama produk, harga produk, kuantitas produk, dan memberikan output berupa informasi detail dari transaksi tersebut seperti total biaya dan lain sebagainya.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kustomer`, `Produk`,`Transaksi` dan `Main` adalah contoh dari class.

```bash
public class Kustomer {
    ...
}


public class Produk {
    ...
}

public class Transaksi extends Produk {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Transaksi[] transaksi = new Transaksi[numTransaksi];`,`Kustomer kustomer = new Kustomer(namaKustomer);`adalah contoh pembuatan object.

```bash
Scanner scanner = new Scanner(System.in);

Transaksi[] transaksi = new Transaksi[numTransaksi];
Kustomer kustomer = new Kustomer(namaKustomer);

```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaKustomer`,`jumlah`,`namaProduk`,`hargaProduk`,`numTransaksi` dan `validInput` adalah contoh atribut.

```bash
String namaKustomer;
int jumlah;
String namaProduk;
double hargaProduk;
int numTransaksi = 0;
boolean validInput = false;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kustomer`,`Produk` dan `Transaksi`.

```bash
 public Kustomer( String namaKustomer) {
        this.namaKustomer = namaKustomer;
    }

 public Produk(String namaProduk, double hargaProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }

    public Transaksi(String namaProduk, double hargaProduk, Kustomer kustomer,  int jumlah) {
        super(namaProduk, hargaProduk); 
        this.kustomer = kustomer;
        this.jumlah = jumlah;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaKustomer`,`setNamaProduk`,`setHargaProduk`,`setKustomer` dan `setJumlah` adalah contoh method mutator.

```bash
 public void setNamaKustomer(String namaKustomer) {
        this.namaKustomer = namaKustomer;
    }
 public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
 public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }
public void setKustomer(Kustomer customer) {
        this.kustomer = customer;
    }
  public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini,,`getNamaKustomer`,`getNamaProduk` ,`getHargaProduk`,`getKustomer`,`getJumlah`,`getNamaKustomer`,`getNamaProduk`dan `getJumlah` adalah contoh method accessor.

```bash
public String getNamaKustomer() {
        return namaKustomer;
    }
public String getNamaProduk() {
        return namaProduk;
    }
  public double getHargaProduk() {
        return hargaProduk;
    }
   public Kustomer getKustomer() {
        return kustomer;
    }
   public int getJumlah() {
        return jumlah;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaKustomer`,`kustomer`,`jumlah`,`namaProduk` dan `hargaProduk` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String namaKustomer;
 private String namaProduk;
 private double hargaProduk;
 private Kustomer kustomer;
 private int jumlah;

```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Transaksi` mewarisi `Produk` dengan sintaks `extends`.

```bash
public class Transaksi extends Produk {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo()` di `Kustomer` dan `displayInfo()` di `Produk` merupakan overloading `displayInfo()` di `Transaksi` merupakan override dari method `displayInfo()` di `Produk`.

```bash
 public void displayInfo() {
        System.out.println("Nama Kustomer: " + namaKustomer);
    }

   public void displayInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp." + hargaProduk);
    }

 @Override
    public void displayInfo() {
        super.displayInfo();
        kustomer.displayInfo();
        System.out.println("Kuantitas: " + jumlah);
        System.out.println("Total Harga: Rp." + (super.getHargaProduk() * jumlah));
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` dalam looping output `transaksiOut` untuk menentukan apakah transaksi lebih dari Rp.100.000.
```bash
 if (transaksiOut.getHargaProduk() * transaksiOut.getJumlah() > 100000) {
                transaksiOut.displayInfo();
                System.out.println();
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input ,menampilkan data seluruh data dan menampilkan data yang lebih dari Rp.100.000.

```bash
for (int i = 0; i < numTransaksi; i++) {
    ...
}

for (Transaksi transaksiOut : transaksi) {
    ...
}

 for (Transaksi transaksiOut : transaksi) {
            if (transaksiOut.getHargaProduk() * transaksiOut.getJumlah() > 100000) {
                transaksiOut.displayInfo();
                System.out.println();
            }
        }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Kustomer untuk transaksi " + (i + 1) + ": ");
String namaKustomer = scanner.nextLine();
System.out.print("Masukkan nama Produk untuk transaksi " + (i + 1) + ": ");
String namaProduk = scanner.nextLine();
System.out.print("Masukkan harga Produk untuk transaksi " + (i + 1) + ": ");
hargaProduk = scanner.nextDouble();
scanner.nextLine();
System.out.print("Masukkan Kuantitas untuk transaksi " + (i + 1) + ": ");
jumlah = scanner.nextInt();
scanner.nextLine();

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `transaksi[i] = new Transaksi(namaProduk, hargaProduk, kustomer, jumlah);` adalah contoh penggunaan array.

```bash
transaksi[i] = new Transaksi(namaProduk, hargaProduk, kustomer, jumlah);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
                    System.out.print("Masukkan harga Produk untuk transaksi " + (i + 1) + ": ");
                    hargaProduk = scanner.nextDouble();
                    scanner.nextLine();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scanner.next(); 
                }

try {
                    System.out.print("Masukkan Kuantitas untuk transaksi " + (i + 1) + ": ");
                    jumlah = scanner.nextInt();
                    scanner.nextLine();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scanner.next(); 
                }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rahmatul Maulidyah
NPM: 2110010391
