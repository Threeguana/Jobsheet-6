import java.util.Scanner;
public class soal102 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        
        int terbesar;

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input02.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input02.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input02.nextInt();
        
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }

            System.out.println("Angka terbesar adalah " + terbesar);
            
        }

        input02.close();
    }
}
