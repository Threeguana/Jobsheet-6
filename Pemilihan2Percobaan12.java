import java.util.Scanner;
public class Pemilihan2Percobaan12 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input02.nextInt();

        if (tahun % 4 == 0) {
            System.out.println("Tahun kabisat");
            if (tahun % 100 == 0) {
                System.out.println("Bukan tahun kabisat");
                if (tahun % 400 == 0) {
                    System.out.println("tahun kabisat");
                }
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

        input02.close();
    }
}