import java.util.Scanner;
public class soal302 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        String merk, kategori;
        int ukuran, harga = 0;
        boolean validInput = true;

        System.out.println("======== Toko Sepatu ========");
        System.out.print("Pilih merk yang ingin anda beli: ");
        merk = input02.nextLine().trim();

        if (merk.equalsIgnoreCase("Converse")) {
            System.out.println("Pilih Kategori Sepatu Converse:");
            System.out.println("1. Slip On");
            System.out.println("2. High Top");
            System.out.print("Pilih (1/2): ");
            if (input02.hasNextInt()) {
                int Kategori = input02.nextInt();
                input02.nextLine();

                if (Kategori == 1) {
                    kategori = "Slip On";
                    System.out.print("Masukkan ukuran sepatu anda (36-40): ");
                    if (input02.hasNextInt()) {
                        ukuran = input02.nextInt();
                        input02.nextLine(); 
                        if (ukuran >= 36 && ukuran <= 40) {
                            harga = 800000;
                        } else {
                            System.out.println("Ukuran sepatu tidak tersedia untuk Slip On.");
                            validInput = false;
                        }
                    } else {
                        System.out.println("Input ukuran harus berupa angka!");
                        validInput = false;
                        input02.nextLine();
                    }
                } else if (Kategori == 2) {
                    kategori = "High Top";
                    System.out.print("Masukkan ukuran sepatu anda (40-44): ");
                    if (input02.hasNextInt()) {
                        ukuran = input02.nextInt();
                        input02.nextLine();
                        if (ukuran >= 40 && ukuran <= 44) {
                            harga = 1200000;
                        } else {
                            System.out.println("Ukuran sepatu tidak tersedia untuk High Top.");
                            validInput = false;
                        }
                    } else {
                        System.out.println("Input ukuran harus berupa angka!");
                        validInput = false;
                        input02.nextLine(); 
                    }
                } else {
                    System.out.println("Input kategori salah!");
                    validInput = false;
                }
            } else {
                System.out.println("Input kategori harus berupa angka!");
                validInput = false;
                input02.nextLine(); 
            }

        } else if (merk.equalsIgnoreCase("Sketcher")) {
            System.out.println("Pilih Kategori Sepatu Sketcher:");
            System.out.println("1. Woman");
            System.out.println("2. Man");
            System.out.print("Pilih (1/2): ");
            if (input02.hasNextInt()) {
                int Kategoriategori = input02.nextInt();
                input02.nextLine();

                if (Kategoriategori == 1) {
                    kategori = "Woman";
                    System.out.print("Masukkan ukuran sepatu anda (36-41): ");
                    if (input02.hasNextInt()) {
                        ukuran = input02.nextInt();
                        input02.nextLine();
                        if (ukuran >= 36 && ukuran <= 41) {
                            harga = 1000000;
                        } else {
                            System.out.println("Ukuran sepatu tidak tersedia untuk Woman.");
                            validInput = false;
                        }
                    } else {
                        System.out.println("Input ukuran harus berupa angka!");
                        validInput = false;
                        input02.nextLine();
                    }
                } else if (Kategoriategori == 2) {
                    kategori = "Man";
                    System.out.print("Masukkan ukuran sepatu anda (41-44): ");
                    if (input02.hasNextInt()) {
                        ukuran = input02.nextInt();
                        input02.nextLine();
                        if (ukuran >= 41 && ukuran <= 44) {
                            harga = 1800000;
                        } else {
                            System.out.println("Ukuran sepatu tidak tersedia untuk Man.");
                            validInput = false;
                        }
                    } else {
                        System.out.println("Input ukuran harus berupa angka!");
                        validInput = false;
                        input02.nextLine();
                    }
                } else {
                    System.out.println("Input kategori salah!");
                    validInput = false;
                }
            } else {
                System.out.println("Input kategori harus berupa angka!");
                validInput = false;
                input02.nextLine();
            }

        } else if (merk.equalsIgnoreCase("Nike")) {
            System.out.println("Pilih Kategori Sepatu Nike:");
            System.out.println("1. Kids");
            System.out.println("2. Adult");
            System.out.print("Pilih (1/2): ");
            if (input02.hasNextInt()) {
                int Kategoriategori = input02.nextInt();
                input02.nextLine();

                if (Kategoriategori == 1) {
                    kategori = "Kids";
                    System.out.print("Masukkan ukuran sepatu anda (36-40): ");
                    if (input02.hasNextInt()) {
                        ukuran = input02.nextInt();
                        input02.nextLine();
                        if (ukuran >= 36 && ukuran <= 40) {
                            harga = 750000;
                        } else {
                            System.out.println("Ukuran sepatu tidak tersedia untuk Kids.");
                            validInput = false;
                        }
                    } else {
                        System.out.println("Input ukuran harus berupa angka!");
                        validInput = false;
                        input02.nextLine(); 
                    }
                } else if (Kategoriategori == 2) {
                    kategori = "Adult";
                    System.out.print("Masukkan ukuran sepatu anda (40-44): ");
                    if (input02.hasNextInt()) {
                        ukuran = input02.nextInt();
                        input02.nextLine();
                        if (ukuran >= 40 && ukuran <= 44) {
                            harga = 1500000;
                        } else {
                            System.out.println("Ukuran sepatu tidak tersedia untuk Adult.");
                            validInput = false;
                        }
                    } else {
                        System.out.println("Input ukuran harus berupa angka!");
                        validInput = false;
                        input02.nextLine(); 
                    }
                } else {
                    System.out.println("Input kategori salah!");
                    validInput = false;
                }
            } else {
                System.out.println("Input kategori harus berupa angka!");
                validInput = false;
                input02.nextLine(); 
            }

        } else {
            System.out.println("Merk tidak tersedia.");
            validInput = false;
        }

        if (validInput && harga > 0) {
            String formattedHarga = String.format("%,d", harga).replace(",", "."); 
            System.out.println("Harga sepatu: " + formattedHarga);
        }

        System.out.println("Terima kasih telah berbelanja!");
        input02.close(); 
    }
}
