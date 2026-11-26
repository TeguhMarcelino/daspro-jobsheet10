import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        int opsi;
        do {
            System.out.print("Pilih Opsi (1-Input Penonton, 2-Lihat Daftar Penonton, 3-Exit): ");
            opsi = sc.nextInt();
            sc.nextLine();

            if (opsi == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Baris atau kolom tidak valid. Silakan masukkan input lagi.");
                        continue;
                    }
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        continue;
                    }


                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();

                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (opsi == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println(penonton[i][j]);
                            System.out.print("\t");
                        } else {
                            System.out.println("***");
                            System.out.print("\t");
                        }
                    }
                    System.out.println();
                }
            }
        } while (opsi != 3);

        sc.close();
    }
}
    