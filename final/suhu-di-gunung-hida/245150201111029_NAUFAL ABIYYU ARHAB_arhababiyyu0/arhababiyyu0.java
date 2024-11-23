import java.util.*;
public class soalsuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double suhufahrenheit = input.nextDouble();
        double suhuCpuncak = (suhufahrenheit - 32) * (5.0/9);

        double c1 = suhuCpuncak + 5;
        double r1 = c1 * (4.0/5);
        double c2 = suhuCpuncak + 13;
        double r2 = c2 * (4.0/5);
        double k0 = suhuCpuncak + 273.15;
        double k2 = c2 + 273.15;
        double sk = k0 - k2;

        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("%s%.2f%s\n", "Satuan Celsius : ", c1, " C");
        System.out.printf("%s%.2f%s\n", "Satuan Reamur  : ", r1, " R");
        
        System.out.println("== Suhu di Pos 2");
        System.out.printf("%s%.2f%s\n", "Satuan Celsius : ", c2, " C");
        System.out.printf("%s%.2f%s\n", "Satuan Reamur  : ", r2, " R");
        
        System.out.println("== Selisih Suhu Awal ke Pos 2");
        System.out.printf("%s%.2f%s\n", "Selisih Suhu   : ", sk, " K");
        System.out.println("==============================");

        input.close();
    }
}
