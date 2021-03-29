/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_week4;
import java.util.Scanner;
/**
 * @author Tanti
 */
public class Tugas1_PerulanganFor {
    public static void main(String[] args) {
        int btsAwal;
        int btsAkhir;
        int bil;
        
        Scanner isi = new Scanner(System.in);
        System.out.println("          Bilangan Genap          ");
        System.out.println("==================================");
        System.out.println();
        System.out.print("Masukkan Batas Minimum Bilangan Genap = ");
        btsAwal = isi.nextInt();
        
            if(btsAwal % 2 > 0){
                System.out.println("Maaf Bilangan Yang Anda Masukkan Pada Batas Minimum Bukan Bilangan Genap.");
            } else {
                System.out.print("Masukkan Batas Maksimum Bilangan Genap = ");
                btsAkhir = isi.nextInt();
                    if(btsAkhir % 2 > 0){
                        System.out.println("Maaf Bilangan Yang Anda Masukkan Pada Batas Maksimum Bukan Bilangan Genap.");
            } else {
                for (int i = btsAwal; i <= btsAkhir; i+= 2) {
                        System.out.print(i + " ");
                }
            }
                    
            }         
    }
}
