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

        String item1Desc = String.format("%d x %d - %d%%", item1Quantity, item1Price, item1Discount); //ex: 3 x 4000 - 7%
        String item2Desc = String.format("%d x %d - %d%%", item2Quantity, item2Price, item2Discount); //ex: 2 x 8000 - 9%


        double subTotal1 = item1Quantity*item1Price;
        double subTotal2 = + item2Quantity*item2Price;
        double subTotal = item1Quantity*item1Price + item2Quantity*item2Price;
        double total = subTotal + (0.05 * subTotal) + (0.10 * subTotal);
        double change = payment - subTotal;



        System.out.println("------------------------------");
        System.out.println("Nokotan Mart");
        System.out.println("Jl. Noko Shikanoko");
        System.out.println("------------------------------");
        System.out.printf("%30s\n", date);
        System.out.println(customerName);
        System.out.println(customerId);
        System.out.println("------------------------------");
        System.out.println(item1Name);
        System.out.printf("%-15s%15.2f\n", item1Desc, subTotal1);
        System.out.println(item2Name);
        System.out.printf("%-15s%15.2f\n", item2Desc, subTotal2);
        System.out.println("------------------------------");
        System.out.printf("%-15s%15.2f\n", "Subtotal", subTotal);
        System.out.printf("%-15s%15.2f\n", "Total", total);
        System.out.printf("%-15s%15.2f\n", "Bayar", payment);
        System.out.printf("%-15s%15.2f\n", "Kembali", change);
        System.out.println("------------------------------");

    }
}