import java.util.Scanner;

public class ProgramJavaGLB {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);

        int pilihan, A1 = 0, A2 = 0, A3 = 0;
        float rumus;
        String loop;

        System.out.println("-----------------------------------");
        System.out.println("    Tugas Ujian Tengah Semester    ");
        System.out.println("-----------------------------------");
        System.out.println(" Aplikasi Menghtiung Rumus Fisika  ");
        System.out.println("   Menghitung Pada Rumus Fisika    ");
        System.out.println("-----------------------------------");
        System.out.println("1. Menghitung Rumus Usaha");
        System.out.println("2. Menghitung Periode Getaran");
        System.out.println("3. Menghitung Massa Jenis");
        System.out.println("4. Menghitung Gaya");
        System.out.println("5. Menghitung Gerak Lurus Beraturan");
        System.out.println("6. keluar");
        System.out.println("-----------------------------------");
        System.out.println("Menghitung dengan Rumus Fisika Lainnya? (Y/N): ");
        for (loop = "Y"; loop.equals("Y") || loop.equals("y");) {
            System.out.println("Pilih Menu (1 s/d 6): ");

            int Pilihan = save.nextInt();
            switch(Pilihan) {
                case 1:
                    System.out.println("Menghitung Rumus Usaha");
                    System.out.println("");
                    System.out.println("+----------------------+");
                    System.out.println("1. Menghitung Besarnya Usaha (W)");
                    System.out.println("+----------------------+");
                    System.out.println("Masukkan Besarnya Gaya (N): ");
                    A1 = save.nextInt();
                    System.out.println("Masukkan Perpindahan Benda (m): ");
                    A2 = save.nextInt();
                    A3 = A1*A2;
                    System.out.println("");

                    System.out.println("Diketahui: ");
                    System.out.println("Gaya(F) = " + A1 + "N");
                    System.out.println("Perpindahan (S) = " + A2 + "m");
                    System.out.println("");
                    System.out.println("-> Usaha (W) = F * S");
                    System.out.println("w = " + A1 + "*" + A2 + "");
                    System.out.println("w = " + A3 + " Joule");
                    System.out.println("+---------------------------+");
                    break;
                case 2:
                    System.out.println("Menghitung Rumus Periode Getaran");
                    break;
                case 3:
                    System.out.println("Menghitung Rumus Massa jenis");
                    break;
                case 4:
                    System.out.println("Menghitung Rumus Gaya");
                    break;
                case 5:
                    System.out.println("Anda Memilih Rumus Gerak Lurus Beraturan");
                    System.out.println("-------------------------------------------");
                    System.out.println("Pilih 1 untuk mencari Kecepatan (m/s)");
                    System.out.println("Pilih 2 untuk mencari Jarak yang ditempuh (m)");
                    System.out.println("Pilih 3 untuk Mencari Waktu Tempuh (s)");
                    System.out.println("Masukkan Pilihan: ");
                    int pil = save.nextInt();
                    System.out.println("-------------------------------------------");

                    if(pil == 1){
                        System.out.println("Anda ingin mencari Kecepatan");
                        System.out.println("---------------------------------------");
                        System.out.println("Masukkan jarak yang ditempuh(m): ");
                        float satu = save.nextFloat();
                        System.out.println("Masukkan waktu tempuh(sekon): ");
                        float dua = save.nextFloat();
                        rumus = satu/dua;
                        System.out.println("Hasilnya adalah: " + satu + "/" + dua + " = " + rumus + " m/s");
                    } else if (pil == 2) {
                        System.out.println("Anda ingin mencari Jarak");
                        System.out.println("---------------------------------------");
                        System.out.println("Masukkan kecepatan: ");
                        float tiga = save.nextFloat();
                        System.out.println("Masukkan waktu ditempuh(s): ");
                        float dua = save.nextFloat();
                        double satu = tiga*dua;
                        System.out.println("Jaraknya adalah "+satu+"dua");
                        System.out.println("");

                        System.out.println("Anda Ingin Mencari waktu");
                        System.out.println("---------------------------------------");
                        System.out.println("Masukkan jarak yang ditempuh(m): ");
                        float s = save.nextFloat();
                        System.out.println("Masukkan kecepatan: ");
                        float vb = save.nextFloat();

                        System.out.println("Hasilnya adalah: " + vb + "s");
                    } else {
                        System.out.println("pilihan tidak ada");
                    }
                case 6:
                    System.out.println("keluar");
                default:
                    System.out.println("Ketik [Y] untuk kembali ke pilihan utama [N] ke pilihan rumus GLB [E] untuk keluar dari aplikasi: ");
                    loop = save.next();
            }
        }
    }
}
