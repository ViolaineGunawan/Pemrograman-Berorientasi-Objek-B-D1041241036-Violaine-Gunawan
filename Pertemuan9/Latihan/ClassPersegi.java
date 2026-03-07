/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 7 Maret 2026
Program: Latihan class mobil pertemuan 9
*/

package Pertemuan9.Latihan;
class Persegi{ //class persegi
    int sisi; //atribut class
    int luas; //atribut class
    int keliling; //atribut class

    public void hitungLuas(){ //method class
        luas = sisi * sisi;
    }
    public void hitungKeliling(){ //method class
        keliling = 4 * sisi;
    }
    public void tampilkanHasil(){ //method class
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi       : " + sisi + " cm");
        System.out.println("Luas       : " + luas + " cm²");
        System.out.println("Keliling   : " + keliling + " cm");
    }
}
public class ClassPersegi {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(); //membuat objek baru dari class persegi
        persegi1.sisi = 5;
        persegi1.hitungLuas();
        persegi1.hitungKeliling();
        persegi1.tampilkanHasil();
    }
}
