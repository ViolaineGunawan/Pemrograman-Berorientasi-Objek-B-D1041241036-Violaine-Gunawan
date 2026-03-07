/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 7 Maret 2026
Program: Latihan class mobil pertemuan 9
*/

package Pertemuan9.Latihan;

class Mobil{
    String merk;
    String warna;
    int tahun;
    int kecepatan=0; //inisialisasikan kecepatan = 0 untuk semua object nantinya;

    public void tampilkanSpesifikasi(){ //method
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Tahun       : " + tahun);
    }

    public void percepat(){ //method 
        kecepatan = kecepatan + 20; 
        System.out.println("Mobil dipercepat...");
    }

    public void tampilkanKecepatan(){ //method
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

public class ClassMobil {
    public static void main(String[] args) {
    Mobil mobil1 = new Mobil(); //membuat objek mobil1
    mobil1.merk = "Toyota Avanza";
    mobil1.warna = "Silver";
    mobil1.tahun = 2020;
    mobil1.tampilkanSpesifikasi(); //panggil method
    System.out.println();
    mobil1.percepat(); //panggil method
    mobil1.percepat(); //panggil method
    System.out.println();
    mobil1.tampilkanKecepatan(); //panggil method
    }
}
