/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Senin, 16 Februari 2026
Program: Latihan 3, Pertemuan 4
*/
package Pertemuan4.Latihan_Pertemuan4;

public class LatihanCounter {
    public static void main(String[] args) {
    int counter = 10;
    System.out.println("=== COUNTER ===");
    System.out.println("Nilai awal: " +  counter);
    counter++; //Post increment dua kali
    counter++;
    System.out.println("Setelah ++ (2x): " + counter);
    counter--; //Post decrement 
    System.out.println("Setelah --: " + counter);
    counter += 5; //counter = counter + 5
    System.out.println("Setelah += 5: " + counter);
    counter -= 3; //counter = counter - 3
    System.out.println("Setelah -= 3: " + counter);
    counter *= 2; //counter = counter * 2
    System.out.println("Setelah *= 2: " + counter);
    }   
}
