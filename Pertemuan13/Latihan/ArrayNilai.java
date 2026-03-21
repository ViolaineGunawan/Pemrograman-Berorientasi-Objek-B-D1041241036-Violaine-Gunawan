/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 21 Maret 2026
Program: Latihan 1: Array Nilai Pertemuan 13
*/

package Pertemuan13.Latihan;

public class ArrayNilai {
    public static void main(String[] args) {
        int[] nilai = {85, 90, 78, 92, 88};//array
        System.out.println("=== DAFTAR NILAI ===");
        for (int i = 0; i < nilai.length; i++) {//looping dari 0 hingga <panjang array karena array selalu dimulai dari 0
            System.out.println("Nilai " + (i+1) + ": " + nilai[i]);//mencetak elemen array
        }
        System.out.println("\nTotal Nilai: " + nilai.length);//mencetak total elemen dalam array
    }
}
