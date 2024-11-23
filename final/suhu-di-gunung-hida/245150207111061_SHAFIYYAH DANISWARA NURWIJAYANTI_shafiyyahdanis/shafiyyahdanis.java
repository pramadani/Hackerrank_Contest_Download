import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double n = scanner.nextDouble();
        double celsius1 = (5.0 / 9.0) * (n - 32);
        double reamur1 = (4.0 / 5.0) * celsius1;
        double kelvin1 = celsius1 + 273.15;
        double celsiusPos1 = celsius1 + 5.0;
        double reamurPos1 = (4.0 / 5.0) * celsiusPos1;
        double celsiusPos2 = celsiusPos1 + 8.0;
        double reamurPos2 = (4.0 / 5.0) * celsiusPos2;
        double kelvinPos2 = celsiusPos2 + 273.15;
        double selisihKelvin = kelvin1 - kelvinPos2;

       
        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("Satuan Celsius : %.2f C%n", celsiusPos1);
        System.out.printf("Satuan Reamur  : %.2f R%n", reamurPos1);
        System.out.println("== Suhu di Pos 2");
        System.out.printf("Satuan Celsius : %.2f C%n", celsiusPos2);
        System.out.printf("Satuan Reamur  : %.2f R%n", reamurPos2);
        System.out.println("== Selisih Suhu Awal ke Pos 2");
        System.out.printf("Selisih Suhu   : %.2f K%n", selisihKelvin);
        System.out.println("==============================");
    }
}


