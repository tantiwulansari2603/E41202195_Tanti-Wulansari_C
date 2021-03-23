/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1_array;
import java.util.Scanner;
/**
 *
 * @author Tanti
 */
public class Latihan5_SwicthCase {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan Nama Warna = ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.print("Lampu merah, Berhenti!");
                break;
            case "kuning":
                System.out.print("Lampu kuning, Harap Hati-hati!");
                break;
            case "hijau":
                System.out.print("Lampu hijau, Silahkan Jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah!");
        }
            
    }
}
