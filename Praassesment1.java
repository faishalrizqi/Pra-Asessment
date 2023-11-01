import java.util.Scanner;

public class Praassesment1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int angka2 = input.nextInt();
        int angka3 = input.nextInt();

        System.out.println(enkripsi(angka));
        System.out.println(enkripsi2(angka2));
        System.out.println(enkripsi3(angka3));
    }
    static String enkripsi(int angka) {
        int ribuan = ((angka / 1000 + 5) % 10);
        int ratusan = ((angka / 100 + 5) % 10);
        int puluhan = ((angka / 10 + 5) % 10);
        int satuan = ((angka + 5) % 10);

        return (ribuan +""+ satuan +""+ puluhan +""+ ratusan);
    }
    static String enkripsi2(int angka2) {
        int ribuan = ((angka2 / 1000) + 5 % 10);
        int ratusan = ((angka2 / 100 % 10) + 5 % 10);
        int puluhan = ((angka2 / 10 % 10) + 5 % 10);
        int satuan = ((angka2 % 10 ) + 5 % 10);

        return (ribuan +""+ satuan +""+ puluhan +""+ ratusan);
    }
    static String enkripsi3(int angka3) {
        int ribuan = ((angka3 / 1000 + 5) % 10);
        int ratusan = ((angka3 /100 + 5) % 10);
        int puluhan = ((angka3 / 10 + 5) % 10);
        int satuan = ((angka3 + 5) % 10);

        return (ribuan +""+ satuan +""+ puluhan +""+ ratusan);
    }
}

 

