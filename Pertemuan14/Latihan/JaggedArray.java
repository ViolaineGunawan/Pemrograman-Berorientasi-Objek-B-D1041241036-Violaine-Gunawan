/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 21 Maret 2026
Program: Latihan 2: Jagged Array Pertemuan 14
*/
package Pertemuan14.Latihan;

public class JaggedArray {
    public static void main(String[] args) {
        int [][] jagged = {{10,20},{30,40,50,60},{70,80,90}};
        System.out.println("=== JAGGED ARRAY ===");
        for(int i=0; i<jagged.length; i++){ //outer loop untuk baris
            System.out.print("Baris " + i + " (" + jagged[i].length + "elemen): ");
            for(int j=0; j<jagged[i].length; j++){//inner loop untuk kolom
                System.out.print(jagged[i][j] + " ");//cetak semua elemen array dalam baris ke-i
            }
            System.out.println();
        }
    }
}
