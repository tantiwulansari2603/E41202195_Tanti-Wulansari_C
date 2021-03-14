/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Tanti
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int nim;
        int usia;
        double rata;
        
        Scanner isi= new Scanner (System.in);
        System.out.println("Masukkan Nama:  ");
        nama = isi.nextLine ();
        System.out.println("Masukkan NIM: ");
        nim = isi.nextInt ();
        System.out.println("Masukkan Usia: ");
        usia = isi.nextInt ();
        System.out.println("Rata-rata Nilai: ");
        rata = isi.nextDouble();
    }
    
}
