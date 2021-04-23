package Tugas2;

import Tugas1.Televisi;
/**
 *
 * @author Tanti
 */
public class TelevisiModern extends Televisi {
    static final String TELETEXT = "Teletext";
    static final String TV = "Televisi";
    
    private String modusTampilan;
    private String cdPlay;
    private String DiscTray;
    
        TelevisiModern(String Deskripsi, int maxChannels) {
            super(Deskripsi, maxChannels);
        }
        
        public void setModusTampilan(String modusTampilan) {
            System.out.println("Modus Tampilan : "+ modusTampilan);
            this.modusTampilan = modusTampilan;
        }
    
        public void setHalamanTeletext(int HalTeletext) {
            System.out.printf("Berpindah ke halaman teletext %d\n", HalTeletext);
        }
        
        public void playCD() {
            if (DiscTray == null) {
                System.out.println("Tidak ada CD di dalam disc tray!");
            } else {
            System.out.printf("Memutar Film %s\n", DiscTray);
            }
        }
        
        public void setDiscTray(String DiscTray) {
            this.DiscTray = DiscTray;
        }



}
