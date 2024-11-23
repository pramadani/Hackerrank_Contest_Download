package remedLC1;

import java.util.Scanner;

public class SoalRemed1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String tanggal = scanner.nextLine();
        String nama = scanner.nextLine();
        String nomor = scanner.nextLine();
        
        String nama1 = scanner.nextLine();
        int harga1 = scanner.nextInt();
        int kuantitas1 = scanner.nextInt();
        int diskon1 = scanner.nextInt();

        scanner.nextLine();

        String nama2 = scanner.nextLine();
        int harga2 = scanner.nextInt();
        int kuantitas2 = scanner.nextInt();
        int diskon2 = scanner.nextInt(); 
        
        double pembayaran = scanner.nextDouble();

        // Hitung subtotal dan total
        double subTotal1 = kuantitas1 * harga1 * (1 - diskon1 / 100.0);
        double subTotal2 = kuantitas2 * harga2 * (1 - diskon2 / 100.0);
        double subTotal = subTotal1 + subTotal2;
        
        // Diskon member 5% dan pajak 10%
        double diskonMember = 0.05;
        double pajak = 0.10;
        double total = subTotal * (1 - diskonMember) * (1 + pajak);
        
        // Hitung kembalian
        double kembalian = pembayaran - total;

        // Format output
        System.out.println("------------------------------");
        System.out.println("Nokotan Mart");
        System.out.println("Jl. Noko Shikanoko");
        System.out.println("------------------------------");
        System.out.printf("%30s%n", tanggal);
        System.out.println(nama);
        System.out.println(nomor);
        System.out.println("------------------------------");
        
        System.out.printf("%-20s%n", nama1);
        System.out.printf("%d x %d - %d%%         %.2f%n", kuantitas1, harga1, diskon1, subTotal1);
        System.out.printf("%-20s%n", nama2);
        System.out.printf("%d x %d - %d%%         %.2f%n", kuantitas2, harga2, diskon2, subTotal2);
        
        System.out.println("------------------------------");
        System.out.printf("Sub Total           %.2f%n", subTotal);
        System.out.printf("Total               %.2f%n", total);
        System.out.printf("Bayar               %.2f%n", pembayaran);
        System.out.printf("Kembali             %.2f%n", kembalian);
        System.out.println("------------------------------");
    }
}

