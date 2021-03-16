/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4_tantiwulansari_e41202195_c;

import java.util.Scanner;

public class Latihan4_TantiWulansari_E41202195_C {

    public static void main(String[] args) {
    //Membuat Scanner
        Scanner s1 = new Scanner(System.in);
        
    //Mengambil Nilai Dari Keyboard
        System.out.print("Masukkan Nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan Nilai2 = ");
        int nilai2 = s1.nextInt();
        
    //Menghitung dan cetak
        int jumlah = nilai1 + nilai2;
        System.out.print("Jumalah = " +jumlah);
        
    } 
}
