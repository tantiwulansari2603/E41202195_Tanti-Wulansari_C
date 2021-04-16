/**
 *
 * @author Tanti
 */

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] Args)
    {
        int k, angka;
        System.out.println("============Binary Search============");
        System.out.println();
        System.out.println("Data Yang Ada : ");
        boolean notfound = true;
        int[] data = {13, 14, 15, 16, 17, 18, 19, 20};
        
       
            for(int i = 0; i < data.length; i++)         {
                System.out.print(data[i] + " ");
            }
        Scanner isi = new Scanner(System.in);
        System.out.print("\nMasukan angka yang dicari = ");
        angka = isi.nextInt();
       
        int Atas=data.length-1;
        int Bawah=0;
       
        while (notfound)
        {
            int posisiSekarang = (Atas + Bawah) / 2;
            if(data[posisiSekarang] == angka)
            {
                notfound = false;
                System.out.println("Angka "+angka+" ditemukan" );
            }
            else if(Bawah > Atas)
            {
            System.out.println("Angka " +angka+" tidak ditemukan");
            break;
            }
            else
            {
                if(data[posisiSekarang]< angka)
                {
                    Bawah = posisiSekarang+1;
                }
                else
                {
                    Atas = posisiSekarang-1;
                }
            }
        }
    }
}

       