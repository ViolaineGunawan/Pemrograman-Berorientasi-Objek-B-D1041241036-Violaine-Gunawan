/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 1, Pertemuan 7
*/
package Pertemuan7;

public class LatihanDeretGanjil {
    public static void main(String[] args) {
        int angka = 1;
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        while(angka<16){ //jika angka <=15
            if(angka%2!=0){//jika angka ganjil
                System.out.print(angka + " ");
            }
            angka++; //angka ditambah 1
        } 
    }
}
