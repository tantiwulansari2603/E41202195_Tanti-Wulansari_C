/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasa_arraysatudimensi;
import java.util.Scanner;
/**
 *
 * @author Tanti
 */
public class TugasE_TampilanDenganKondisiSwitchCase {
    public static void main(String[] args) {
        String pembeli;
        int pilihan;
        Scanner isi = new Scanner(System.in);
        
        
        System.out.println("                   Cafe Ceria                   ");
        System.out.println("                  Aneka Minuman                 ");
        System.out.println("------------------------------------------------");
        System.out.println("                 Spesial Menu :                 ");
        System.out.println("                 1. Soft Drinks                 ");
        System.out.println("                 2. Mix Juice                   ");
        System.out.println("                 3. Nescafe                     ");
        System.out.println("                 4. Soda Milk                   ");
        System.out.println("                 5. Tea                         ");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan Nama Pembeli : ");
        pembeli = isi.nextLine();
        System.out.println("");
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        pilihan = isi.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("Minuman Yang Anda Pesan Adalah : Soft Drinks");
                break;
            case 2:
                System.out.println("Minuman Yang Anda Pesan Adalah : Mix Juice");
                break;
            case 3:
                System.out.println("Minuman Yang Anda Pesan Adalah : Nescafe");
                break;
            case 4:
                System.out.println("Minuman Yang Anda Pesan Adalah : Soda Milk");
                break;
            case 5:
                System.out.println("Minuman Yang Anda Pesan Adalah : Tea");
                break;
            default:
                System.out.println("Maaf Menu Yang Anda Pesan Tidak Tersedia");
        }
        
        System.out.println("Pesanan Akan Segera Kami Antar");
        System.out.print("Terima kasih "+ pembeli);
        System.out.print(" Telah Berkunjung DiCafe Ceria");
    }
}
