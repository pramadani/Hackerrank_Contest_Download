import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double suhuawal= scanner.nextDouble();
       double c1=((suhuawal-32)*5/9)+5;
       double r1=(c1*4/5);
       double c2=(suhuawal-32)*5/9+13;
       double r2=(c2*4/5);
       double sK=((suhuawal-32)*5/9+273.15)-(c2+273.15);
       
        System.out.println("===== Suhu Anda Sekarang =====");
        System.out.println("== Suhu di Pos 1");
        System.out.printf("%s%.2f%s\n","Satuan Celsius : ",c1," C");
        System.out.printf("%s%.2f%s\n","Satuan Reamur  : ",r1," R");
        System.out.printf("%s\n","== Suhu di Pos 2");
        System.out.printf("%s%.2f%s\n","Satuan Celsius : ",c2," C");
        System.out.printf("%s%.2f%s\n","Satuan Reamur  : ",r2," R");
        System.out.printf("%s\n","== Selisih Suhu Awal ke Pos 2");
        System.out.printf("%s%.2f%s\n","Selisih Suhu   : ",sK," K");
        System.out.println("==============================");
    }
}
