/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Jumat, 13 Februari 2026
Program: Mencoba program p041NamingConvention, Pertemuan 4
*/
package Pertemuan4;

public class p041NamingConvention {
    public static final double PI = 3.14; //penamaan final(tidak dapat diubah) dengan CONSTANT_CASE
    public static void main(String[] args) {
        int studentAge = 20; //penamaan camelCase
        String studentName = "Budi"; //penamaan camelCase
        boolean isActive = true; //penamaan boolean dengan prefix is
        System.out.println("Nama: " + studentName);
        System.out.println("Umur: " + studentAge);
        System.out.println("Status: " + isActive);
        System.out.println("Konstanta PI: " + PI);
    }
}
