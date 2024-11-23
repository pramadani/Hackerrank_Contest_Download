import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        double n = input.nextDouble();

        //proses
        double c1 = (n -32) * ((double)5/9) + 5;
        double r1 = (n -32) * ((double)4/9) + (5*4/5);
        double c2 = c1 + 8;
        double r2 = r1+((double)8*4/5);
        double sk = ((n-32)*((double) 5/9))+273.15;
        double selisih = sk - (c2+273.15);

         //hasil
         System.out.print("===== Suhu Anda Sekarang =====");
         System.out.println("\n== Suhu di Pos 1");
         System.out.printf("%-15s: %.2f %s\n", "Satuan Celsius " , c1, "C");
         System.out.printf("%-15s: %.2f %s", "Satuan Reamur " , r1, "R");
         System.out.println("\n== Suhu di Pos 2");
         System.out.printf("%-15s: %.2f %s\n", "Satuan Celsius " , c2, "C");
         System.out.printf("%-15s: %.2f %s", "Satuan Reamur " , r2, "R");
         System.out.println("\n== Selisih Suhu Awal ke Pos 2");
         System.out.printf("%-15s: %.2f %s\n", "Selisih Suhu  " , selisih, "K");
         System.out.print("==============================");
    }
}