import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double c1 = (n - 32) * ((double)5/9) + 5;
        double r1 = (n - 32) * ((double)4/9) + 5 * ((double)4/5);
        double c2 = c1 + 8;
        double r2 = r1 + 8 * ((double) 4/5);
        double k1 = (n - 32) * ((double)5/9) + 273.15;
        double k2 = c2 + 273.15;
        double Sk = k1 - k2;
        
         System.out.println("===== Suhu Anda Sekarang =====");
         System.out.println("== Suhu di Pos 1");
         System.out.printf("%-15s: %.2f %s\n", "Satuan Celsius " , c1, "C");
         System.out.printf("%-15s: %.2f %s", "Satuan Reamur " , r1, "R");
         System.out.println("\n== Suhu di Pos 2");
         System.out.printf("%-15s: %.2f %s\n", "Satuan Celsius " , c2, "C");
         System.out.printf("%-15s: %.2f %s", "Satuan Reamur " , r2, "R");
         System.out.println("\n== Selisih Suhu Awal ke Pos 2");
         System.out.printf("%-15s: %.2f %s\n", "Selisih Suhu  " , Sk, "K");
         System.out.print("==============================");
    }    
}