import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner radit = new Scanner(System.in);

        double n = radit.nextDouble();
        double celsius = (n - 32) * 5 / 9;
        double reamur = celsius * 4 / 5;
        double celsiusPos1 = celsius + 5;
        double reamurPos1 = celsiusPos1 * 4 / 5;
        double celsiusPos2 = celsiusPos1 + 8;
        double reamurPos2 = celsiusPos2 * 4 / 5;
        double kelvinPos2 = celsiusPos2 + 273.15;
        double kelvinPos1 = celsius + 273.15;
        double selisihKelvin = (kelvinPos2 - kelvinPos1) * (-1);

        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("Satuan Celsius : %.2f C\n", celsiusPos1);
        System.out.printf("Satuan Reamur  : %.2f R\n", reamurPos1);
        System.out.println("== Suhu di Pos 2");
        System.out.printf("Satuan Celsius : %.2f C\n", celsiusPos2);
        System.out.printf("Satuan Reamur  : %.2f R\n", reamurPos2);
        System.out.println("== Selisih Suhu Awal ke Pos 2");
        System.out.printf("Selisih Suhu   : %.2f K\n", selisihKelvin);
        System.out.println("==============================");
    }
}