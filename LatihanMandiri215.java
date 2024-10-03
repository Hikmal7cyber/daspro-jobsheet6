import java.util.Scanner;

public class LatihanMandiri215 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        double hargaBuku = 20000;
        double diskon = 0;
        double totalHarga;

        System.out.println("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input15.nextLine();
        System.out.println("Masukkan jumlah buku: ");
        int jumlahBuku = input15.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
        } 

        totalHarga = (hargaBuku * jumlahBuku) - (hargaBuku * jumlahBuku * diskon);


    }
}

