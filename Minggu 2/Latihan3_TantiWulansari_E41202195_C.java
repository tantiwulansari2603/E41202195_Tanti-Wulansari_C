/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3_tantiwulansari_e41202195_c;

/**
 *
 * @author Tanti
 */
 class book {
        int price;
        int pages;
        
        public void set (int price, int pages) {
            this.price = price;
            this.pages = pages;
        }
        
        public void show (){
            System.out.println("Books Information");
            System.out.println("Books Price : " +price);
            System.out.println("Books Pages : " +pages);
        }
    }
public class Latihan3_TantiWulansari_E41202195_C {
    public static void main(String[] args) {
            book javabook = new book();
            javabook.set(60000, 100);
            javabook.show();
        }
    }
    
