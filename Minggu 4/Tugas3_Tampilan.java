/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_week4;
import java.util.Scanner;
/**
 *
 * @author Tanti
 */
public class Tugas3_Tampilan {
    public static void main(String[] args) {
        int bnykNilai;
        int min;
        int max;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Data Nilai = ");
        bnykNilai = input.nextInt();
        double jumlah = 0;
        double avg;
        
        int[] array = new int[bnykNilai];
        
            for (int i = 0; i < array.length; i++) {
                System.out.print("Masukkan Nilai Ke "+ i +" = ");
                array[i] = input.nextInt();
            }
            
        min = array[0];
        max = array[0];
            for (int j = 0; j<array.length; j++) {
                if(array[j] > max){
                    max = array[j];
                }
                else if(array[j] < min){
                    min = array[j];
                }
            }
        System.out.println("");
        System.out.println("Nilai Minimum = "+ min);
        System.out.println("Nilai Maksimum = "+ max);
            for (int t=0; t<array.length; t++){
                jumlah = jumlah + array[t]; 
            }
            avg = jumlah / array.length;
        System.out.println("Nilai Rata-ratanya Adalah = "+ avg);
    }
}
