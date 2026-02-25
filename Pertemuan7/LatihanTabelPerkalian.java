/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 3, Pertemuan 7
*/
package Pertemuan7;

public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        int angka = 7; //variabel angka
        System.out.println("=== TABEL PERKALIAN " + angka + " ===");
        for(int i=1;i<13;i++){
            int hasil = angka*i; //angka dikali i
            System.out.println(angka + " x " + i + " = " + hasil); //tampilkan hasil perkalian
        }
    }
}
