import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n = in.nextDouble();
        double c1 = (( n - 32 )*( 5 / 9.0 )) + 5;
        double r1 = (( 4 / 9.0 )*( n - 32 )) + ( 4 / 5.0 ) * 5 ;

        double c2 = c1 + 8.0;
        double r2 = r1 + ( 4 / 5.0 ) * 8 ;
        double sK = (c1 + 273) - (c2 + 273) - 5;
        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("Satuan Celsius : %5.2f C\n", c1);
        System.out.printf("Satuan Reamur  : %5.2f R\n", r1);
        System.out.println("== Suhu di Pos 2");
        System.out.printf("Satuan Celsius : %5.2f C\n", c2);
        System.out.printf("Satuan Reamur  : %5.2f R\n", r2);
        System.out.println("== Selisih Suhu Awal ke Pos 2");
        System.out.printf("Selisih Suhu   : %5.2f K\n", sK);
        System.out.println("==============================");
    }
}