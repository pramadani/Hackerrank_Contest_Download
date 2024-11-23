import java.util.Scanner;

public class SuhuGunungHida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suhuFahrenheit = scanner.nextDouble();

        double suhuCelsiusAwal = (suhuFahrenheit - 32) * 5 / 9;
        double suhuReamurAwal = suhuCelsiusAwal * 4 / 5;

        double suhuCelsiusPos1 = suhuCelsiusAwal + 5;
        double suhuReamurPos1 = suhuCelsiusPos1 * 4 / 5;

        double suhuCelsiusPos2 = suhuCelsiusPos1 + 8;
        double suhuReamurPos2 = suhuCelsiusPos2 * 4 / 5;

        double selisihSuhu = suhuCelsiusAwal - suhuCelsiusPos2;
        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("Satuan Celsius : %.2f C\n", suhuCelsiusPos1);
        System.out.printf("Satuan Reamur  : %.2f R\n", suhuReamurPos1);
        System.out.println("== Suhu di Pos 2");
        System.out.printf("Satuan Celsius : %.2f C\n", suhuCelsiusPos2);
        System.out.printf("Satuan Reamur  : %.2f R\n", suhuReamurPos2);
        System.out.println("== Selisih Suhu Awal ke Pos 2");
        System.out.printf("Selisih Suhu   : %.2f K\n", selisihSuhu);
        System.out.println("==============================");
    }
}
