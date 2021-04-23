package Tugas1;

import java.util.Arrays;

/**
 *
 * @author Tanti
 */
public class Televisi {
    private String Deskripsi;
    private String nameTelevisi;
    private int maxChannels;
    private String[] Channels;
    

    public Televisi(String nameTelevisi, int maxChannels) {
        this.nameTelevisi = nameTelevisi;
        this.maxChannels = maxChannels;
    }
    
    public Televisi() {
        
    }
    
    public String getDeskripsi() {
        return nameTelevisi;
    }
    
    public void getChannels() {
        if (Channels == null) {
            System.out.println("Belum ada Channels yang di set");
        } else {
            System.out.println(Arrays.toString(Channels));
        }
    }   
    
    public void setChannels(String[] Channels) {
        if (Channels.length > maxChannels) {
            System.out.println("Maaf Televisi ini hanya dapat menyimpan " 
                                +maxChannels+ " Channels ");
        } else {
            System.out.println("Informasi channel berhasil diupdate!");
            this.Channels = Channels;
        }
    }
    
    public void setChannelAktif(int activeChannel) {
        if (activeChannel >= maxChannels) {
            System.out.println("Channel yang Anda inginkan belum diset ");
        } else {
            System.out.printf("Pindah channel ke : %s\n", Channels[activeChannel]);
        }
    }
    
    public void setVolume(int Volume) {
        System.out.println("Intensitas volume sekarang : " + Volume);
    }
    
}
