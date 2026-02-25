/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 2, Pertemuan 8
*/
package Pertemuan8;

public class LatihanCariKelipatan {
    public static void main(String[] args) {
        System.out.println("=== CARI KELIPATAN 7 ===");
        for(int angka=1;angka<=50;angka++){
            System.out.println("Cek: " + angka);
            if(angka%7==0){//apakah i merupakan kelipatan 7?
                System.out.println("Kelipatan 7 pertama: " + angka);
                System.out.println("Pencarian selesai. ");
                break;//Memberhentikan Perulangan
            }
        }
    }
}
