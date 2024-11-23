import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
       Scanner scanner = new Scanner(System.in);
        
       String date = scanner.nextLine();
        
        String customerName = scanner.nextLine();
        String customerId = scanner.nextLine();
        
        String item1Name = scanner.nextLine();
        int item1Price = scanner.nextInt();
        int item1Quantity = scanner.nextInt();
        int item1Discount = scanner.nextInt();
        double harga1=item1Price*item1Quantity*(1- (item1Discount / 100.0));
        scanner.nextLine();

        String item2Name = scanner.nextLine();
        int item2Price = scanner.nextInt();
        int item2Quantity = scanner.nextInt();
        int item2Discount = scanner.nextInt(); 
        double harga2=item2Price*item2Quantity*(1- (item2Discount / 100.0));
        double subtotal=harga1+harga2;
        double total1=subtotal*(1 - (5 / 100.0));
        double total= total1*(1 +(10/ 100.0));
        
        double payment = scanner.nextDouble();
        double change= payment-total;
        
        String item1Desc = String.format("%d x %d - %d%%", item1Quantity, item1Price, item1Discount); //ex: 3 x 4000 - 7%
        String item2Desc = String.format("%d x %d - %d%%", item2Quantity, item2Price, item2Discount); //ex: 2 x 8000 - 9%
        
     System.out.println("------------------------------");
        System.out.println("Nokotan Mart\n" +"Jl. Noko Shikanoko");
        System.out.println("------------------------------");
        System.out.printf("%30s\n",(String)date);
        System.out.println(customerName);
        System.out.println(customerId);
        System.out.println("------------------------------");
        System.out.println(item1Name);
        System.out.printf("%d%s%d%s%d%s%17.2f\n",item1Quantity," x ",item1Price," - ",item1Discount,"%",(double)harga1);
        System.out.println(item2Name);
        System.out.printf("%d%s%d%s%d%s%17.2f\n",item2Quantity," x ",item2Price," - ",item2Discount,"%",(double)harga2);
        System.out.println("------------------------------");
        System.out.printf("%-20s%10.2f\n","Sub Total",(double)subtotal);
        System.out.printf("%-20s%10.2f\n","Total",total);
        System.out.printf("%-20s%10.2f\n","Bayar",payment);
        System.out.printf("%-20s%10.2f\n","Kembali",change);
        System.out.println("------------------------------");

    }
}
