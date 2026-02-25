/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 4, Pertemuan 7
*/
package Pertemuan7;

public class LatihanRefleksi {
    public static void main(String[] args) {
    //Menggunakan while
    System.out.println("=== MENGGUNAKAN WHILE ===");
    int angka = 1;
    while(angka<6){
        System.out.print(angka + " ");
        angka++;
    }
    System.out.println("\n");
    //Menggunakan Do-While
    System.out.println("=== MENGGUNAKAN DO-WHILE ===");
    angka = 1;
    do{
        System.out.print(angka + " ");
        angka++;
    }
    while(angka<6);
    System.out.println("\n");
    //Menggunakan for
    System.out.println("=== MENGGUNAKAN FOR ===");
    for(angka=1;angka<6;angka++){
        System.out.print(angka + " ");
    }
    }  
}
