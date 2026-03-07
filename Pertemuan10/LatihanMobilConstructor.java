/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 7 Maret 2026
Program: Latihan 2 class mobil pertemuan 10
*/
package Pertemuan10;
class Mobil{
    String merk; //atribut class
    String warna;
    int tahun;
    
    public Mobil(){ //Constructor tanpa parameter
        merk = "Belum diisi";
        warna = "Belum diisi"; 
        tahun = 0;
    }

    public Mobil(String m){ //Constructor dengan 1 parameter (merk)
        merk = m;
        warna = "Belum diisi"; 
        tahun = 0;
    }

    public Mobil(String merk, String warna, int tahun){ //Constructor dengan 3 parameter dan menggunakan this
        this.merk = merk;
        this.warna = warna; 
        this.tahun = tahun;
    }  

    public void tampilkanSpesifikasi(){ //method
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Tahun       : " + tahun +"\n");
    }
}
public class LatihanMobilConstructor {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();//membuat objek 1
        mobil1.tampilkanSpesifikasi();

        Mobil mobil2 = new Mobil("Toyota"); //membuat dan menginisialisasi merk objek 1
        mobil2.tampilkanSpesifikasi();

        Mobil mobil3 = new Mobil("Honda Civic","Merah",2023); //membuat dan menginisialisasi objek 1
        mobil3.tampilkanSpesifikasi();
    }
}
