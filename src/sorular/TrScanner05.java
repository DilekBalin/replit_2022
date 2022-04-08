package sorular;

import java.util.Scanner;

public class TrScanner05 {
    //Kullanıcıdan bir Float değer girmesini isteyin,
    // bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ondalikli bir sayi giriniz");
        float sayi=scanner.nextFloat();
        short sayi1=(short)sayi;
        System.out.println(sayi1);
    }
}
