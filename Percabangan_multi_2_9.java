/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan_multi_2_9;
import java.util.Scanner;
/**
 *
 * @author Tanti
 */
public class Percabangan_multi_2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int Pilihan;
    String Kode_nama;
    
    Scanner masukan = new Scanner(System.in);
    Scanner in_nama = new Scanner(System.in);
    
    System.out.print("Masukkan Pilihan : ");
    Pilihan = masukan.nextInt();
    
    System.out.print("Masukkan Kode Nama : ");
    Kode_nama = in_nama.nextLine();
    
    if (Pilihan ==1)
    {
        if (Kode_nama.equals("tnt"))
            System.out.println("Selamat Datang Manager Tanti");
        else if (Kode_nama.equals("wln"))
                System.out.println("Selamat Datang Manager Wulan");
        else if (Kode_nama.equals("sr"))
                System.out.println("Selamat Datang Manager Sari");
        else
            System.out.print(" Anda Bukan Manager Ya ");    
    }
    else if (Pilihan ==2)
        if (Kode_nama.equals("si"))
            System.out.println("Selamat Datang Kasir Sri");
        else if (Kode_nama.equals("jk"))
            System.out.println("Selamat Datang Kasir Joko");
        else
            System.out.println("Anda Bukan Karyawan Kami");
    
    
    }
    
    
}
