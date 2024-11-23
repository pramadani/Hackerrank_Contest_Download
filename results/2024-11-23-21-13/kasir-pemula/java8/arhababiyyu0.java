import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
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
        double subTotal1 = item1Quantity * item1Price * (item1Discount/100.0);
        double subTotal11 = (item1Quantity * item1Price) - subTotal1;
        double subTotal2 = item2Quantity * item2Price * (item2Discount/100.0);
        double subTotal22 = (item2Quantity * item2Price) - subTotal2;
        double subTotal = subTotal11 + subTotal22;

        double diskonMwmber = subTotal*0.05;
        double dsikon33 = subTotal - diskonMwmber;
        double pajak = dsikon33*0.1;
        double pajak33 = dsikon33 + pajak;
        double kembalian = payment - pajak33;


        System.out.printf("%-30s\n", "------------------------------");
        System.out.println("Nokotan Mart");
        System.out.println("Jl. Noko Shikanoko");
        System.out.printf("%-30s\n", "------------------------------");
        System.out.printf("%30s\n", date);
        System.out.println(customerName);
        System.out.println(customerId);
        System.out.printf("%-30s\n", "------------------------------");
        
        System.out.println(item1Name);
        System.out.printf("%-20s", item1Desc);
        System.out.printf("%10.2f\n", subTotal11);
        System.out.println(item2Name);
        System.out.printf("%-20s", item2Desc);
        System.out.printf("%10.2f\n", subTotal22);
        
        System.out.printf("%-30s\n", "------------------------------");
        System.out.printf("%-20s", "Sub Total");
        System.out.printf("%10.2f\n", subTotal);
        
        System.out.printf("%-20s", "Total");
        System.out.printf("%10.2f\n", pajak33);
        
        System.out.printf("%-20s", "Bayar");
        System.out.printf("%10.2f\n", payment);
        
        System.out.printf("%-20s", "Kembali ");
        System.out.printf("%10.2f\n", kembalian);

        scanner.close();
    }
}