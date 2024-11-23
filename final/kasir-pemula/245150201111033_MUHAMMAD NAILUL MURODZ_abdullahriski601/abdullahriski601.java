
import java.util.Scanner;

public class kasikoko {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tanggal, nama,id,item1;
        int harga1,jumlah1,diskon1;
        String item2;
        int harga2,jumlah2,diskon2;
        double bayar;

        tanggal = in.nextLine();
        nama = in.nextLine();
        id = in.nextLine();
        item1 = in.nextLine();
        harga1 = in.nextInt();
        jumlah1=in.nextInt();
        diskon1= in.nextInt();

        String x = in.nextLine();
        double payment1 = (double) (harga1*jumlah1)-(harga1*jumlah1*(double) diskon1/100);
        
        item2 = in.nextLine();
        harga2 = in.nextInt();
        jumlah2=in.nextInt();
        diskon2= in.nextInt();
        bayar= in.nextDouble();
        
        double payment2 = (double) (harga2*jumlah2)-(harga2*jumlah2*(double) diskon2/100);

        System.out.println("------------------------------");
        System.out.println("Nokotan Mart");
        System.out.println("Jl. Noko Shikanoko");
        System.out.println("------------------------------");
        System.out.printf("%30s\n",tanggal);
        System.out.println(nama);
        System.out.println(id);
        System.out.println("------------------------------");
        System.out.println(item1);
        String c = jumlah1 + " x " + harga1 + " - " + diskon1 + "%";
        System.out.printf("%-20s%10.2f\n",c,payment1);  
        System.out.println(item2);
        String d = jumlah2 + " x " + harga2 + " - " + diskon2 + "%";
        System.out.printf("%-20s%10.2f\n",d,payment2);  
        System.out.println("------------------------------");
        System.out.printf("%-20s%10.2f\n","Sub Total",(payment1+payment2));
        double subtotal =(payment1+payment2);
        double total = (subtotal - (subtotal*0.05));
        total = total + (total*0.1); 
        System.out.printf("%-20s%10.2f\n","Total",total);
        System.out.printf("%-20s%10.2f\n","Bayar",bayar);
        System.out.printf("%-20s%10.2f\n","Kembali",(bayar-total));
        System.out.println("------------------------------");
        
    }

}
