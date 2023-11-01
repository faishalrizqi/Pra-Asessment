import java.util.Scanner;

public class Praassesment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        hasil(A + B);
    }
    public static void hasil(int angka){
        int digit1 = angka / 100;
        int digit2 = (angka / 10) % 10;
        int digit3 = angka % 10;

        System.out.printf("%s ratus %s puluh %s", ganti(digit1), ganti(digit2), ganti(digit3));
    }

    public static String ganti(int angka){
        String huruf = "";
        switch (angka){
            case 2: huruf = "dua";break;
            case 3: huruf = "tiga"; break;
            case 4: huruf = "empat"; break;
            case 5: huruf = "lima"; break;
            case 6: huruf = "enam"; break;
            case 7: huruf = "tujuh"; break;
            case 8: huruf = "delapan"; break;
            case 9: huruf = "sembilan"; break;
        }
        return huruf;
    }
}
