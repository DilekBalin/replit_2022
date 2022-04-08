package sorular;

import java.util.Scanner;

public class TrScanner03 {

    /*Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" iki sayi giriniz= ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int cevre=2*(a+b);
        int alan=a*b;
        System.out.println("Dikdortgenin cevresi= "+cevre);
        System.out.println("Dikdortgenin alani= "+alan);

    }

}
