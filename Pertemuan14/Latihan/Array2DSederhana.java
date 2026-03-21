/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 21 Maret 2026
Program: Latihan 1: Array 2D Sederhana Pertemuan 14
*/
package Pertemuan14.Latihan;

public class Array2DSederhana {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};//deklarasi dan inisialisasi array 2d
        System.out.println("=== TABEL 3x3 ===");
        for(int i=0; i<arr.length; i++){ //outer loop untuk baris
            for(int j=0; j<arr[i].length; j++){//inner loop untuk kolom
                System.out.print(arr[i][j] + "     ");//cetak semua elemen array dalam baris ke-1
            }
            System.out.println();
        }

    }
}
