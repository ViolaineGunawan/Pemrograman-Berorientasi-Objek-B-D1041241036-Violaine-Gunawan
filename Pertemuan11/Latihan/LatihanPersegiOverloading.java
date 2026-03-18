/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 18 Maret 2026
Program: Latihan 3: Class Persegi dengan Validasi
*/

package Pertemuan11.Latihan;

class PersegiPanjang{//class persegi panjang
    int panjang;
    int lebar;
    int luas;
    int keliling;
    public PersegiPanjang(int sisi){//constructor 1: untuk persegi
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = this.panjang * this.lebar;
        this.keliling = 2 * (this.panjang + this.lebar);
    }
    public PersegiPanjang(int panjang, int lebar){//constructor 2: untuk persegi panjang
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = this.panjang * this.lebar;
        this.keliling = 2 * (this.panjang + this.lebar);
    }
    public void tampilkanInfo(){//method tampilkan info
        if(this.panjang==this.lebar){
            System.out.println("=== PERSEGI ===");//jika persegi
        }
        else{
            System.out.println("=== PERSEGI PANJANG ===");//jika bukan persegi
        }
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm\n");
    }
}
public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang(5);
        persegi1.tampilkanInfo();
        PersegiPanjang persegi2 = new PersegiPanjang(8, 4);
        persegi2.tampilkanInfo();
    }
}
