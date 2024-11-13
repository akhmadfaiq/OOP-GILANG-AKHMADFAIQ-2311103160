/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author giafa
 */
public class komputerpremium extends komputer {
    protected boolean ruangPrivat;

    public komputerpremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    
    public void informasi() {
        super.informasi();
        System.out.println("Private Room: " + (ruangPrivat ? "Yes" : "No"));
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Computer number " + nomorKomputer + " has been reserved.");
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Service added: " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Service added: " + makanan + " and " + minuman);
    }
}

