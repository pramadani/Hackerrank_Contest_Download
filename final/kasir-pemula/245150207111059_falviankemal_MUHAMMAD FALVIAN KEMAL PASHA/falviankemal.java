import java.util.Scanner;
public class bab1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String date=input.nextLine();
        String nama=input.nextLine();
        String id=input.nextLine();


        String namaitem1=input.nextLine();
        int hargaitem1=input.nextInt();
        int jumlahitem1=input.nextInt();
        int diskonitem1=input.nextInt();

        input.nextLine();

        String namaitem2=input.nextLine();
        int hargaitem2=input.nextInt();
        int jumlahitem2=input.nextInt();
        int diskonitem2=input.nextInt();

        double bayar=input.nextDouble();

        double total1=jumlahitem1*hargaitem1*(1-diskonitem1/100);
        double total2=jumlahitem2*hargaitem2*(1-diskonitem2/100);
        double total=total1+total2;
        double memberdiskon=total*0.05;
        double tax=(total-memberdiskon)*0.1;
        double keseluruhan=total-memberdiskon+tax;
        double kembalian = bayar - keseluruhan;

        System.out.println("------------------------------");
        System.out.println("Nokotan Mart");
        System.out.println("Jl. Noko Shikanoko");
        System.out.println("------------------------------");
        System.out.printf("%30s\n", date);
        System.out.println(nama);
        System.out.println(id);
        System.out.println("------------------------------");

        System.out.println(namaitem1);
        System.out.printf("%-20s%10.2f\n", jumlahitem1 + " x " + hargaitem1 + " - " + diskonitem1 + "%", total1);

        System.out.println(namaitem2);
        System.out.printf("%-20s%10.2f\n", jumlahitem2 + " x " + hargaitem2 + " - " + diskonitem2 + "%", total2);

        System.out.println("------------------------------");

        System.out.printf("%-20s%10.2f\n", "Sub Total", total);
        System.out.printf("%-20s%10.2f\n", "Total", keseluruhan);
        System.out.printf("%-20s%10.2f\n", "Bayar", bayar);
        System.out.printf("%-20s%10.2f\n", "Kembali", kembalian);
        System.out.println("------------------------------");







    }
};
