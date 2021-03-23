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
public class TugasD_Tampilan {
    public static void main(String[] args) {
        String pembeli;
        int harga[] = new int[6];
        int total = 0;
        
        Scanner name = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------");
        System.out.println("          Kharisma Agung Plaza ( KAP )         ");
        System.out.println("            Promo Belanja Berhadiah            ");
        System.out.println("      Khusus Pembelian Lima Barang Pertama     ");
        System.out.println("       Dengan Harga Minimum Rp. 10000,00       ");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        pembeli = name.nextLine();

            for (int i=1; i<harga.length; i++) {
                System.out.print("Masukkan Harga ke-"+ i + " : ");
                harga[i] = name.nextInt();
                total = total + harga[i];
            }
        
        System.out.println("Total harga pembelian atas nama "+pembeli+ " adalah :" + total);
        
            if (total>=10000) {
                System.out.println( "Selamat ..... ");
                System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
                System.out.println("-----------------------------------------------");
                System.out.println("                  Terimakasih                  ");
                System.out.println(" Anda Sudah Berbelanja Di Kharisma Agung Plaza ");
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("                  Terimakasih                  ");
                System.out.println(" Anda Sudah Berbelanja Di Kharisma Agung Plaza ");
        }
    }
}
