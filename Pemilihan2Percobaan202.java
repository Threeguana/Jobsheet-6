import java.util.Scanner;
public class Pemilihan2Percobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        
        int pilihanMenu;
        int harga = 0;
        double totalBayar;
        double diskon = 0;

        System.out.println("-----------------------------");
        System.out.println("======= MENU CAFE JTI =======");
        System.out.println("-----------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        
        pilihanMenu = input02.nextInt();
        input02.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        String member = input02.nextLine();

        System.out.println("-----------------------------");
        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        } else if (member.equalsIgnoreCase("n")) {
            System.out.println("Tidak ada diskon.");
        } else {
            System.out.println("Input member tidak valid.");
            input02.close();
            return;
        }

        if (pilihanMenu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
        } else if (pilihanMenu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);
        } else if (pilihanMenu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            input02.close();
            return;
        }

        totalBayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + totalBayar);
        
        System.out.println("-----------------------------");

        input02.close();
    }
}
