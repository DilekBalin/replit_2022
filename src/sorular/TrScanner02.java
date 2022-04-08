package sorular;

import java.util.Scanner;

public class TrScanner02 {
    //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

    //Ornek Cikti :
    //Alan: 9
    //Cevre: 12
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scanner.nextInt();
      int cevre=4*sayi;
        int  alan =sayi*sayi;
        System.out.println("Karenin cevresi= "+cevre);
        System.out.println("Karenin alani= "+alan);
    }
}
