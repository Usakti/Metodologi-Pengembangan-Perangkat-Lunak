import java.util.Scanner;

public class ProgramGLBB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Loop;
        int pilihan, a1, b1, c, a2, b2, d1;
        double s1;

        for (Loop = "Y"; Loop.equals("Y") || Loop.equals("y");) {
            System.out.println("-------------------");
            System.out.println("    Pilihan Menu   ");
            System.out.println("-------------------");
            System.out.println("1. Gerak Lurus Beraturan (GLB)");
            System.out.println("2. Gerak Lurus berubah Beraturan (GLBB)");
            System.out.println("-------------------");
            System.out.println(" ");
            System.out.println("Silahkan Masukkan Pilihan Anda: ");
            pilihan = input.nextInt();

            switch(pilihan) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Silahkan input Kecepatan (Km/h): ");
                    a1 = input.nextInt();
                    System.out.println("Silahkan input Waktu (Jam): ");
                    b1 = input.nextInt();

                    c = a1*b1;
                    System.out.println("Hasil Jaraknya: " + c + "Km");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Silahkan input Kecepatan Awal (v0) (m/s): ");
                    a2 = input.nextInt();
                    System.out.println("Silahkan input Waktu (Sekon): ");
                    b2 = input.nextInt();
                    System.out.println("Silahkan input Percepatan (Sekon): ");
                    d1 = input.nextInt();
                    s1 = (a2*b2)+(0.5*d1*b2*b2);
                    System.out.print("Hasil Jaraknya: " + s1 + "m");
            }
            System.out.println(" ");
            System.out.println("==========================================================================");
            System.out.println("Ketik [Y] untuk kembali ke menu utama dan [e] untuk keluar dari aplikasi: ");
            Loop = input.next();
        }
    }
}
