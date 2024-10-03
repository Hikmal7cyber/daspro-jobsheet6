import java.util.Scanner;

public class LatihanMandiri215 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        double diskon = 0.0;
        int jumlahBuku, jumlahDiskon, total, hargaBuku = 20000;
        String jenisBuku;

        System.out.print("Masukan Jenis buku: ");
        jenisBuku = input15.nextLine();
        System.out.print("Masukan Jumlah buku: ");
        jumlahBuku = input15.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
            if (jumlahBuku > 2) {
                diskon += 0.02 ;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if  (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                 if (jumlahBuku <= 3)
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku>3) {
                diskon = 0.05;

            }
        }
        double hargaTotal = hargaBuku * jumlahBuku;
        double totalDiskon = hargaTotal* diskon;
        total = (int) (hargaBuku * jumlahBuku - totalDiskon);

        System.out.println("Total Diskon: " + totalDiskon);
        System.out.println("Total Bayar: " + total );
    }
}

