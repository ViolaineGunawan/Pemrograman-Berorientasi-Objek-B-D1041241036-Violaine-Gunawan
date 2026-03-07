/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 7 Maret 2026
Program: Latihan 3 class persegi pertemuan 10
*/
package Pertemuan10;
class Persegi{
    int sisi; //atribut class
    int luas; //atribut class
    int keliling; //atribut class
    public Persegi(int sisi) { //Constructor dengan validasi input
        if (sisi <= 0) { 
        System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1)."); 
        this.sisi = 1; 
        } else { 
        this.sisi = sisi; 
        } 
        this.luas = this.sisi * this.sisi; 
        this.keliling = 4 * this.sisi; 
    }
    public void tampilkanHasil(){ //method class
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi       : " + sisi + " cm");
        System.out.println("Luas       : " + luas + " cm²");
        System.out.println("Keliling   : " + keliling + " cm\n");
    }
}


public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(5); //membuat objek 1
        persegi1.tampilkanHasil();

        Persegi persegi2 = new Persegi(-3); //membuat objek 2 dengan nilai negatif, program akan langsung menginisiasi sisinya = 1 
        persegi2.tampilkanHasil();
    }    
}
