import java.util.Scanner;
        public class HckerRank {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Masukkan Tanggal Praktikum :");
         String Tanggal = scanner.nextLine();
         
         System.out.println("Masukkan Nama Pelanggan :");
         String NamaPelanggan = scanner.nextLine();
         
         System.out.println("Masukkan NIM :");
         String IDPelanggan = scanner.nextLine();
         
         System.out.println("Masukkan Nama barang Item1 :" );
         String Item1 = scanner.nextLine();
          System.out.println("Masukkan Nama barang Item2 :" );
         String Item2 = scanner.nextLine();
         
         System.out.println("Masukkan Harga Barang 1:");
         int HargaItem1 = scanner.nextInt();
         
         System.out.println("Masukkan Jumlah Barang 1 :");
         int JumlahItem1 = scanner.nextInt();
         System.out.println("Masukkan Harga Barang 2 : ");
         int HargaItem2 = scanner.nextInt();
         System.out.println("Masukkan Jumlah Barang 2 :");
         int JumlahItem2 = scanner.nextInt();
         System.out.println("Masukkan Diskon :");
         int Diskon = scanner.nextInt();
         System.out.println("Masukkan Jumlah Uang Pembayaran :");
         int Bayar = scanner.nextInt();
         
         int SubTotal1 = HargaItem1 * JumlahItem1;
         int SubTotal2 = HargaItem2 * JumlahItem2;
         double HargaDiskon1 = (double) SubTotal1 * Diskon / 100;
         double Pajak1 = (double) SubTotal1 * 10 / 100;
         double HargaDiskon2 = (double) SubTotal2 * Diskon / 100;
         double Pajak2 = (double) SubTotal2 * 10 / 100;
         int Total1 = (int) (SubTotal1 - HargaDiskon1 + Pajak1);
         int Total2 = (int) (SubTotal2 - HargaDiskon2 + Pajak1);
         int SubTotal = (int) (SubTotal1 + SubTotal2);
         int Total = (int) (Total1 + Total2);
         int Kembalian = (int) Bayar - Total1 - Total2;
         
         System.out.println("------------------------------");
         System.out.println("Nokotan Mart");
         System.out.println("------------------------------");
         System.out.printf("%-s%c\n", Tanggal + "September 2024", '|');
         System.out.println(NamaPelanggan);
         System.out.println(IDPelanggan);
         System.out.println("------------------------------");
         System.out.println(Item1);
         System.out.println(JumlahItem1 + "x" + HargaItem1 + "-" + Diskon + "%");
         System.out.println(Item2);
         System.out.println(JumlahItem2 + "x" + HargaItem2 + "-" + Diskon + "%");
         System.out.println("Harga Total Barang 1" + "HargaItem1 * JumlahItem1 :" + SubTotal1);
         System.out.println("Harga Total Barang 2" + " HargaItem2 * JumlahItem2 :" + SubTotal2);
         System.out.println("------------------------------");
         System.out.println("Sub Total" +          SubTotal);
         System.out.println("Total" +              Total);
         System.out.println("Bayar" +              Bayar);
         System.out.println("Kembali" +            Kembalian);
         System.out.println("------------------------------");
         
         
         
    }   
}