import java.util.Scanner;

public class GunungHida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit = scanner.nextDouble();
        double celsiuspuncak = (fahrenheit - 32) * 5 / 9;
        double reamurpuncak = celsiuspuncak * 4 / 5;

        double celsiusPos1 = celsiuspuncak + 5;
        double celsiusPos2 = celsiusPos1 + 8;

        double reamurPos1 = celsiusPos1 * 4 / 5;
        double reamurPos2 = celsiusPos2 * 4 / 5;
        
        double kelvinpuncak = celsiuspuncak + 273.15;
        double kelvinPos2   = celsiusPos2 + 273.15;
        double selisihkelvin = kelvinpuncak - kelvinPos2;
        

        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("%-15s: %.2f C\n","Satuan Celsius", celsiusPos1);
        System.out.printf("%-15s: %.2f R\n","Satuan Reamur", reamurPos1);
        System.out.println("== Suhu di Pos 2");
        System.out.printf("%-15s: %.2f C\n","Satuan Celsius", celsiusPos2);
        System.out.printf("%-15s: %.2f R\n","Satuan Reamur", reamurPos2);
        System.out.println("== Selisih Suhu Awal ke Pos 2 ");
        System.out.printf("%-15s: %.2f K\n","Selisih Suhu", selisihkelvin);
        System.out.println("==============================");
    }
}