/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasa_tantiwulansari_e41202195_c;
/**
 *
 * @author Tanti
 */
class person {
        String fname;
        String Iname;
        int stuId;
        String stuStatus;
        
        public void set (String fname, String Iname, int stuId, String stuStatus) {
            this.fname = fname;
            this.Iname = Iname;
            this.stuId = stuId;
            this.stuStatus = stuStatus;
        }
        
        public void show (){
            System.out.println("Student Name = " +fname +" " +Iname);
            System.out.println("Student ID = " +stuId);
            System.out.println("Student Status = " +stuStatus);
        }   
    }
public class TugasA_TantiWulansari_E41202195_C {

    public static void main(String[] args) {
        // TODO code application logic here
        person javaperson = new person();
        javaperson.set("Lisa", "Palombo", 123456789, "Active");
        javaperson.show();
    }   
}
