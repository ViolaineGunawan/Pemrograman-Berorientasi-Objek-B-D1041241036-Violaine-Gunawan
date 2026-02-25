/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 2, Pertemuan 7
*/
package Pertemuan7;

import java.util.Scanner;
public class LatihanValidasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//scanner untuk input user
        int percobaan = 0;//simulasikan 3 percobaan
        do{
            System.out.println("=== VALIDASI NILAI UJIAN ===");
            System.out.println(" ");
            System.out.print("Percobaan input: ");
            int nilai = input.nextInt(); //input user
            if(nilai>=0 && nilai<=100){ //jika nilai dalam rentang 0-100
                System.out.println("Nilai valid: " + nilai); //cetak nilai valid
            }
            else{ //jika nilai diluar rentang 0-100 maka error
                System.out.println("Error: Nilai harus antara 0-100!");
            }
            System.out.println(" ");
            percobaan++; //percobaan ditambah 1
        }
        while(percobaan < 3); //untuk membatasi percobaan hanya 3 kali
        input.close();
    }
}
