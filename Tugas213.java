import java.util.Scanner;

public class Tugas213 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int jumlahAngka = 0;
        
        if (n < 3) {
            System.out.println("Nilai n minimal 3");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("\t" + j*i);
                    jumlahAngka = jumlahAngka + j*i;
                } 
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + jumlahAngka);
        }

        sc.close();
    }
}
