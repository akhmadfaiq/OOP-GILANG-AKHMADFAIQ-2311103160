/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;

/**
 *
 * @author giafa
 */
public class MainApp {
    public static void main(String[] args) {
        komputerVIP vip = new komputerVIP(10, "Warnet A", 5000, true);
        komputerpremium premium = new komputerpremium(10, "Warnet B", 7000, true);

        System.out.println("Informasi VIP:");
        vip.informasi();
        vip.login("Asep");
        vip.bermain(2);
        vip.bermain(2, 30);

        System.out.println("\nInformasi Premium:");
        premium.informasi();
        premium.pesan(5);
        premium.tambahLayanan("Snack");
        premium.tambahLayanan("Snack", "Coffee");
    }
}

