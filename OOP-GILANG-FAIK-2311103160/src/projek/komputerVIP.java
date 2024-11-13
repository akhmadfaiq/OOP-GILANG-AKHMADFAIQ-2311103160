/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author giafa
 */
public class komputerVIP extends komputer {
    protected boolean vipCard;

    public komputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    
    public void informasi() {
        super.informasi();
        System.out.println("VIP Card: " + (vipCard ? "Yes" : "No"));
    }

    public void login(String username) {
        System.out.println("User " + username + " has logged in as VIP.");
    }

    public void bermain(int jam) {
        System.out.println("Playing for " + jam + " hours.");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Playing for " + jam + " hours and " + menitTambahan + " additional minutes.");
    }
}

