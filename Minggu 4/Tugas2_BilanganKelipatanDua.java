/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_week4;

/**
 *
 * @author Tanti
 */
public class Tugas2_BilanganKelipatanDua {
    public static void main(String[] args) {
        int bil = 2;
        
        System.out.println("            Do__While          ");
        System.out.println("  Bilangan Kelipatan 2 (1-100) ");
        System.out.println("===============================\n");
        
        do{
            System.out.print(bil + " ");
            bil += 2;
        } while ( bil <= 100);
        }
    }
