import java.util.Scanner;

public class Tugas313 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = sc.nextInt();
        
        if (jumlahToko < 1 ) {
            System.out.println("Jumlah toko minimal 1");
        } else {
            int nomorToko = 1;
            int totalSemuBarang = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;

            while (nomorToko <= jumlahToko) {
                System.out.println("Toko " + nomorToko);

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan : ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0 ) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif");
                    }
                } while (jumlahPelanggan < 0);

                int barangToko=0;

                for (int i = 1; i <= jumlahPelanggan; i++) {
                    int barang;
                    do {
                        System.out.print("    Barang pelanggan " + i + " : ");
                        barang = sc.nextInt();
                        if (barang < 0 ) {
                            System.out.println("    Jumlah barang tidak boleh negatif ");
                        }

                    } while (barang < 0);
                    barangToko += barang;
                }

                System.out.println("Toko " + nomorToko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + barangToko );

                totalSemuBarang += barangToko;

                if (barangToko > barangTerbanyak) {
                    barangTerbanyak = barangToko;
                    tokoTerbanyak = nomorToko;
                }
                
                nomorToko++;
                
            }
            System.out.println("==============================");
            System.out.println("Total barang seluruh toko: " + totalSemuBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }

        sc.close();
    }
}
