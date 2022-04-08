package sorular;

import java.util.Scanner;

public class TrScanner07 {
    //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ondalikli bir sayi giriniz");
        double sayi=scanner.nextDouble();
         int sonuc=(int)sayi;
        System.out.println(sonuc);
    }
}
