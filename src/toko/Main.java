package toko;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTransaksi = 0;
        boolean validInput = false;

 
        while (!validInput) {
            try {
                System.out.print("Masukkan Jumlah Transaksi Yang Akan Dilakukan: ");
                numTransaksi = scanner.nextInt();
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next();
            }
        }

        Transaksi[] transaksi = new Transaksi[numTransaksi];

        for (int i = 0; i < numTransaksi; i++) {
            System.out.println("-----------------------------------------------------------");
            
            System.out.print("Masukkan Nama Kustomer untuk transaksi " + (i + 1) + ": ");
            String namaKustomer = scanner.nextLine();
            
            System.out.print("Masukkan nama Produk untuk transaksi " + (i + 1) + ": ");
            String namaProduk = scanner.nextLine();

            double hargaProduk = 0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan harga Produk untuk transaksi " + (i + 1) + ": ");
                    hargaProduk = scanner.nextDouble();
                    scanner.nextLine();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scanner.next(); 
                }
            }

            int jumlah = 0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan Kuantitas untuk transaksi " + (i + 1) + ": ");
                    jumlah = scanner.nextInt();
                    scanner.nextLine();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scanner.next(); 
                }
            }

            Kustomer kustomer = new Kustomer(namaKustomer);
            transaksi[i] = new Transaksi(namaProduk, hargaProduk, kustomer, jumlah);
        }

        System.out.println("==========================================================");
        System.out.println("\nSemua Transaksi");
        for (Transaksi transaksiOut : transaksi) {
            transaksiOut.displayInfo();
            System.out.println();
        }

        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println("\nTransaksi yang lebih dari Rp. 100.000: ");
        for (Transaksi transaksiOut : transaksi) {
            if (transaksiOut.getHargaProduk() * transaksiOut.getJumlah() > 100000) {
                transaksiOut.displayInfo();
                System.out.println();
            }
        }

        scanner.close();
    }
}
