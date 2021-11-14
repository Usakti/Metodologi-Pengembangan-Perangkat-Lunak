import java.util.Scanner;

public class ProgramKasirKantinFTI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int harga = 0;
        int porsi = 0;
        int uang = 0;

        String[] pilihan = new String[2];

        while(i<2){
            System.out.println("Menu Makanan Di Kantin FTI -->");
            System.out.println("");
            System.out.println(" 1. Nasi Ayam 10000");
            System.out.println(" 2. Nasi Rames 15000");
            System.out.println(" 3. Nasi Gudeg 12000");
            System.out.println(" 4. Jus Mangga 5000");
            System.out.println(" 5. TOTAL");
            System.out.println(" 6. Keluar Aplikasi");
            System.out.println(" ");

            System.out.println("Masukkan Pilihan: ");
            int masuk = input.nextInt();

            if (masuk == 1) {
                System.out.print("Jumlah Porsi Nasi Ayam: ");
                porsi = input.nextInt();
                harga = harga+10000*porsi;
                pilihan[i] = "Nasi Ayam " + porsi + " porsi = " + 10000*porsi;
            } else if (masuk == 2) {
                System.out.print("Jumlah Porsi Nasi Rames: ");
                porsi = input.nextInt();
                harga = harga + 15000*porsi;
                pilihan[i] = "Nasi Rames " + porsi + " porsi = " + 15000*porsi;
            } else if (masuk == 3) {
                System.out.print("Jumlah Jus Mangga: ");
                porsi = input.nextInt();
                harga = harga + 5000*porsi;
                pilihan[i] = "Jus Mangga " + porsi + " porsi = " + 17000*porsi;
            } else if (masuk == 4) {
                System.out.print("Jumlah Jus Mangga: ");
                porsi = input.nextInt();
                pilihan[i] = "Jus Mangga " + porsi + " porsi = " + 5000*porsi;
            } else if (masuk == 5) {
                System.out.println("Total Harga = " + harga);
            } else if (masuk == 6) {
                System.out.println("Keluar Aplikasi");
            }
            i++;
        }

        System.out.println("Pilihan 1: " + pilihan[0] + "\nPilihan 2: " + pilihan[1] + "\nTotal Harga = " + harga);
        System.out.print("Jumlah uang: ");
        uang = input.nextInt();
        System.out.println("Uang Kembalian Kamu Adalah = " + (uang-harga));
    }
}
