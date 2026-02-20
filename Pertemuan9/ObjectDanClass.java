/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Jumat, 20 Februari 2026
Program: Mencoba program dari UML Mobil, pertemuan 9
*/

package Pertemuan9;
  class Mobil{
        String merk;
        String warna;
        int tahun;
        int kecepatan;
    public void percepat(){
        
    }
    public void tampilkanInfo(){
        System.out.println("Merk      :" + merk);
        System.out.println("Warna     :" + warna);
        System.out.println("Tahun     :" + tahun);
        System.out.println("Kecepatan :" + kecepatan);
    }
}

public class ObjectDanClass {
    public static void main(String[] args) {
        Mobil obj = new Mobil();
        obj.merk = "Toyota";
        obj.warna = "Hitam";
        obj.tahun = 2019;
        obj.kecepatan = 100;
        obj.tampilkanInfo();
    }
}
