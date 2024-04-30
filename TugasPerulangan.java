import java.util.Scanner;

public class TugasPerulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan nilai Kehadiran: ");
        double nilket = scanner.nextDouble();
        
        System.out.print("Masukkan nilai Tugas: ");
        double niltug = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double niluts = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double niluas = scanner.nextDouble();

        double nilai = 0;

        nilai = nilket * 0.25 + niltug * 0.2 + niluts * 0.25 + niluas * 0.3;

        char grade;

        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 80) {
                grade = 'A';
            } else if (nilai >= 70) {
                grade = 'B';
            } else if (nilai >= 60) {
                grade = 'C';
            } else if (nilai >= 40) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            switch (grade) {
                case 'A':
                    System.out.println("Selamat, " + nama + " mendapat nilai A!");
                    break;
                case 'B':
                    System.out.println("Bagus, " + nama + " mendapat nilai B.");
                    break;
                case 'C':
                    System.out.println("Cukup, " + nama + " mendapat nilai C.");
                    break;
                case 'D':
                    System.out.println("Anda perlu memperbaiki, " + nama + " mendapat nilai D.");
                    break;
                case 'E':
                    System.out.println("Maaf, " + nama + " mendapat nilai E.");
                    break;
                default:
                    System.out.println("Grade tidak valid.");
            }
        } else {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0 dan 100.");
        }
    }
}