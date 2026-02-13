/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Jumat, 13 Februari 2026
Program: Mencoba program p042OperatorAritmatika, Pertemuan 4
*/
package Pertemuan4;

public class p042OperatorAritmatika {
    public static void main(String[] args) {
        int a = 10; //deklarasi variabel a
        int b = 3; //deklarasi variabel b
        System.out.println("a = " + a); //cetak a
        System.out.println("b = " + b); //cetak b
        System.out.println(); //cetak seperti enter / langkah 1 baris
        System.out.println("a + b = " + (a + b)); //cetak a+b yaitu 13
        System.out.println("a - b = " + (a - b)); //cetak a-b yaitu 7
        System.out.println("a * b = " + (a * b)); //cetak a*b yaitu 30
        System.out.println("a / b = " + (a / b)); //cetak a/b dalam integer yaitu 3
        System.out.println("a % b = " + (a % b)); //cetak sisa bagi a/b yaitu 1
        double hasil = (double) a / b; //jika menggunakan double, maka a/b dapat bentuk desimal
        System.out.println("a / b (desimal) = " + hasil);
    }
}
