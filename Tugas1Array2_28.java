import java.util.Scanner;

public class Tugas1Array2_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;

        int[][] hasilSurvei = new int[responden][pertanyaan];
        double totalKeseluruhan = 0;

        for (int i = 0; i < responden; i++) {
            System.out.println("=== Input Survei Responden ke-" + (i + 1) + " ===");
            for (int j = 0; j < pertanyaan; j++) {
                int jawaban;
                do {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Input anda tidak valid! Masukkan angka 1-5.");
                    }
                } while (jawaban < 1 || jawaban > 5);

                hasilSurvei[i][j] = jawaban;
                totalKeseluruhan += jawaban;
            }
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("Rata-rata nilai per responden:");
        for (int i = 0; i < responden; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < pertanyaan; j++) {
                totalPerResponden += hasilSurvei[i][j];
            }
            System.out.println("Responden ke "+(i + 1) +": " + (totalPerResponden / pertanyaan));
        }

        System.out.println("\n========================================");
        System.out.println("Rata-rata nilai per pertanyaan:");
        for (int j = 0; j < pertanyaan; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < responden; i++) {
                totalPerPertanyaan += hasilSurvei[i][j];
            }
            System.out.println("Pertanyaan ke "+(j + 1) +": " + (totalPerPertanyaan / responden));
        }


        System.out.println("\n========================================");
        double rataRataKeseluruhan = totalKeseluruhan / (responden * pertanyaan);
        System.out.println("Rata-rata keseluruhan: " + rataRataKeseluruhan);
    }
}