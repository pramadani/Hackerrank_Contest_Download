import java.util.Scanner;
public class bab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double farenheit = input.nextDouble();
        double celciuspun = (farenheit - 32) * 5.0 / 9;
        double reamurpun = celciuspun * 4.0 / 5;

        double celcipos1 = celciuspun + 5;
        double reamurpos1 = celcipos1 * 4.0 / 5;
        double celcipos2 = celcipos1 + 8;
        double reamurpos2 = celcipos2 * 4.0 / 5;  

        double kelpuncak = celciuspun + 273.15;
        double kelpos2 = celcipos2 + 273.15;
        double selisihkel = kelpuncak - kelpos2; 

        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1 "); 
        System.out.printf("%-15s: %.2f C\n", "Satuan Celsius", celcipos1);
        System.out.printf("%-15s: %.2f R\n", "Satuan Reamur", reamurpos1);
        System.out.println("== Suhu di Pos 2 ");
        System.out.printf("%-15s: %.2f C\n", "Satuan Celsius", celcipos2);
        System.out.printf("%-15s: %.2f R\n", "Satuan Reamur", reamurpos2);
        System.out.println("== Selisih Suhu Awal ke Pos 2 ");
        System.out.printf("%-15s: %.2f K\n", "Selisih Suhu", selisihkel);
        System.out.println("==============================");
    }
}
