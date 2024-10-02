import java.util.Scanner;
public class soal202 {
        public static void main(String[] args) { 
            Scanner input02 = new Scanner(System.in);

            int jumlah;
            double diskon = 0;
            String jenis;

            System.out.println("Selamat datang di Toko Buku");
            System.out.print("Masukkan jenis buku: ");
            jenis = input02.nextLine().toLowerCase();
            System.out.print("Masukkan jumlah buku: ");
            jumlah = input02.nextInt();

            if (jenis.equalsIgnoreCase("Kamus")) {
                if (jumlah > 2) {
                    diskon = 0.12;
                } else {
                    diskon = 0.1;
                }
            } else if (jenis.equalsIgnoreCase("Novel")) {
                if (jumlah > 3) {
                    diskon = 0.09;
                } else {
                    diskon = 0.08;
                }
            } else {
                if (jumlah > 3) {
                    diskon = 0.05;
                } else {
                    diskon = 0;
                }
            }

            System.out.println("Anda mendapatkan diskon sebesar " + diskon + " % ");

            input02.close();
            
    }
    
}