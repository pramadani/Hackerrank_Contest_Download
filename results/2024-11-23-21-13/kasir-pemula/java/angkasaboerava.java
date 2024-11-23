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

        scanner.nextLine(); 

        String item2Name = scanner.nextLine();
        int item2Price = scanner.nextInt();
        int item2Quantity = scanner.nextInt();
        int item2Discount = scanner.nextInt(); 
        
        double payment = scanner.nextDouble();

        double discount1 = (item1Price * item1Quantity) * (item1Discount / 100.0);
        double subTotal1 = (item1Price * item1Quantity) - discount1;
        double discount2 = (item2Price * item2Quantity) * (item2Discount / 100.0);
        double subTotal2 = (item2Price * item2Quantity) - discount2;
        double subTotal = subTotal1 + subTotal2;

        double memberDiscount = subTotal * 0.05; 
        double totalBeforeTax = subTotal - memberDiscount;
        double tax = totalBeforeTax * 0.10; 
        double total = totalBeforeTax + tax;
        double change = payment - total;

        System.out.println("------------------------------");
        System.out.println("Nokotan Mart");
        System.out.println("Jl. Noko Shikanoko");
        System.out.println("------------------------------");
        System.out.printf("%30s\n", date);
        System.out.println(customerName);
        System.out.println(customerId);
        System.out.println("------------------------------");
        
        System.out.printf("%-20s\n", item1Name);
        System.out.printf("%d x %d - %d%%         %.2f\n", item1Quantity, item1Price, item1Discount, subTotal1);
        System.out.printf("%-20s\n", item2Name);
        System.out.printf("%d x %d - %d%%         %.2f\n", item2Quantity, item2Price, item2Discount, subTotal2);

        System.out.println("------------------------------");
        
        System.out.printf("%-20s %.2f\n", "Sub Total", subTotal);
        System.out.printf("%-20s %.2f\n", "Total", total);
        System.out.printf("%-20s %.2f\n", "Bayar", payment);
        System.out.printf("%-20s %.2f\n", "Kembali", change);
        
        System.out.println("------------------------------");
    }
}