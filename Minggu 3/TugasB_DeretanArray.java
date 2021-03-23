/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasa_arraysatudimensi;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Tanti
 */
public class TugasB_DeretanArray {
    public static void main(String[] args) {
        System.out.print("Masukkan Banyak Angka : ");
        int banyakangka = new Scanner(System.in).nextInt();
 
        Random array = new Random();
        int bilangan;
        
            for ( int i = 1; i <= banyakangka ; i++ ){
                bilangan = array.nextInt(100);
                System.out.printf( " "+ bilangan); 
  
            }  
    
    }
}
