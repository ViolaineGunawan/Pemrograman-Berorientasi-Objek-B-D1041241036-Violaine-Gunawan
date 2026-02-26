/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Kamis, 26 Februari 2026
Program: Latihan 1, Pertemuan 5
*/

package Pertemuan5;

public class LatihBilangan {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);
        if(number>0){//jika number lebih dari 0
            System.out.println("Jenis Bilangan: Positif");
            if(number%2==0){//jika number adalah genap
                System.out.println("Tipe: Genap");
            }
            else{
                System.out.println("Tipe: Ganjil");
            }
        }
        else if(number<0){//jika number kurang dari 0
            System.out.println("Jenis Bilangan: Negatif");
            if(number%2==0){//jika number adalah genap
                System.out.println("Tipe: Genap");
            }
            else{
                System.out.println("Tipe: Ganjil");
            }
        }
        else{//jika number tidak lebih dari 0 atau kurang dari 0, (number adalah 0)
            System.out.println("Jenis: Nol");
        }
    }
}
