/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 1, Pertemuan 8
*/
package Pertemuan8;

public class LatihanMenuHarian {
    public static void main(String[] args) {
    System.out.println("=== MENU MAKAN 3 HARI ===");
    for(int hari=1;hari<4;hari++){
        System.out.println("Hari " + hari + ":");
        for(int waktu=1;waktu<3;waktu++){
            if(hari==1){
                if(waktu==1){ //jika hari=1 dan waktu=1
                    System.out.println("  Pagi: Nasi Goreng");}
                else{//jika hari=1 dan waktu=2
                    System.out.println("  Siang: Soto Ayam");
                }
            }
            else if(hari==2){
                if(waktu==1){//jika hari=2 dan waktu=1
                    System.out.println("  Pagi: Bubur Ayam");}
                else{//jika hari=2 dan waktu=2
                    System.out.println("  Siang: Mie Goreng");
                }
            }
            else{
                if(waktu==1){//jika hari bukan 1 atau 2 (dalam kasus ini hari =3) dan waktu=1
                    System.out.println("  Pagi: Roti Bakar");}
                else{//jika hari=3 dan waktu=2
                    System.out.println("  Siang: Nasi Uduk");
                }
            }
        }
        System.out.println(" ");
    }
    }
}
