/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 21 Maret 2026
Program: Latihan 2: Array Nama Pertemuan 13
*/
package Pertemuan13.Latihan;

public class ArrayNama {
    public static void main(String[] args) {
        String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};//array bertipe string
        System.out.println("=== DAFTAR NAMA ===");
        for (int i = 0; i < nama.length; i++) {  //looping dari 0 hingga <panjang array karena array selalu dimulai dari 0
            System.out.println((i+1) + ". " + nama[i]); //mencetak elemen array
        }
    }
}

