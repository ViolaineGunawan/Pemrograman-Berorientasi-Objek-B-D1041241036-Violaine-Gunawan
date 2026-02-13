/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Jumat, 13 Februari 2026
Program: Latihan 2 Pertemuan 3
*/
package Pertemuan3.Latihan1dan2_pertemuan3;

public class LatihPerhitungan { //nama public class harus sama dengan nama file .java
    public static void main(String[] args) {
        int saldo = 1000000; //buat variabel saldo untuk menampung saldo, dapat menggunakan int
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal           :" + saldo); //tampilkan saldo
        int setoran = 500000; //buat variabel saldo untuk menampung setoran, dapat menggunakan int
        System.out.println("Setoran              :" + setoran);//tampilkan setoran
        saldo += setoran; //tambahkan setoran kedalam saldo (saldo=saldo+setoran)
        System.out.println("Saldo Setelah Setor  :" + saldo); //tampilkan saldo setelah setor
        int penarikan = 250000; //buat variabel penarikan untuk menampung penarikan, dapat menggunakan int
        System.out.println("Penarikan            :" + penarikan); //tampilkan penarikan
        saldo -= penarikan; //kurangi penarikan dari saldo (saldo=saldo-penarikan)
        System.out.println("Saldo Akhir          :" + saldo); //tampilkan saldo akhir
    }
}
