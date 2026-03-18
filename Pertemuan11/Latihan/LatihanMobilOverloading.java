/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 18 Maret 2026
Program: Latihan 1: Class Mobil dengan Constructor Overloading
*/
package Pertemuan11.Latihan;

class Mobil{//class mobil
    String merk;
    String warna;
    int tahun;
    public Mobil(){//Constructor Overloading 1: tanpa parameter
        merk = "Unknown";
        warna = "Unknown";
        tahun = 0;
    }
    public Mobil(String merk){//Constructor Overloading 2: dengan parameter merk
        this.merk = merk;
        warna = "Unknown";
        tahun = 0;
    }
    public Mobil(String merk, String warna, int tahun){//Constructor Overloading 3: dengan 3 parameter
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    public void tampilkanSpesifikasi(){//method class untuk menampikan spesifikasi
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun + "\n");
    }
}

public class LatihanMobilOverloading {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil(); //membuat objek dengan constructor 1
        mobil1.tampilkanSpesifikasi();
        Mobil mobil2 = new Mobil("Toyota");//membuat objek dengan constructor 2
        mobil2.tampilkanSpesifikasi(); 
        Mobil mobil3 = new Mobil("Honda Civic","Merah",2023); //membuat objek dengan constructor 3
        mobil3.tampilkanSpesifikasi();
    }
}