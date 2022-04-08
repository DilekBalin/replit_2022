package sorular;

import java.util.Scanner;

public class TrScanner01 {
    //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        double sayi=scan.nextInt();
        double sonuc=(sayi*sayi*sayi)/2;
        System.out.println("Sonuc ="+sonuc);
    }
}
