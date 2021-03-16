/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasb_managingpeople_tantiwulansari;

import person.person;
/**
 *
 * @author Tanti
 */
public class TugasB_ManagingPeople_TantiWulansari {

    public static void main(String[] args) {
        person p1 = new person("Arial", 37);
        person p2 = new person("Joseph", 15);
        
        
        if(p1.getAge()==p2.getAge()) {
            System.out.println(p1.getName()+" Is the same age as "+p2.getName());
        } 
        else {
            System.out.println(p1.getName()+" Is NOT the same age as "+p2.getName());
        }  
    }
    
}
