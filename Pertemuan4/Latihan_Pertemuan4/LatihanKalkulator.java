/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Senin, 16 Februari 2026
Program: Latihan 2, Pertemuan 4
*/
package Pertemuan4.Latihan_Pertemuan4;

public class LatihanKalkulator {//Membuat kalkulator sederhana
    public static void main(String[] args) {
        int angka1 = 25, angka2 = 4;
        //Variabel untuk menampung hasil berbagai operasi matematika 
        int hasilPenjumlahan = angka1 + angka2;
        int hasilPengurangan = angka1 - angka2;
        int hasilPerkalian = angka1 * angka2;
        int hasilPembagianInt = angka1 / angka2;
        int hasilSisaBagi = angka1 % angka2;
        double hasilPembagianDesimal = (double) angka1/angka2; //Type casting widening, mengubah int -> double
        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);
        System.out.println("---");
        System.out.println("Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Pengurangan: " + hasilPengurangan);
        System.out.println("Perkalian: " + hasilPerkalian);
        System.out.println("Pembagian: " + hasilPembagianInt);
        System.out.println("Sisa Bagi: " + hasilSisaBagi);
        System.out.println("Pembagian Desimal: " + hasilPembagianDesimal);

    }
}
