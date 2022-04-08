package sorular;

import java.util.Scanner;

public class TrIfSwitchTernaryStringMethods6 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse
"isim ayni karakterlere sahiptir." yazdirin.
Eger ayni kaakterlere sahip degilse
"Dizenin benzersiz karakterleri var" yazdirin.
Ternary kullanin.
*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir isim giriniz: ");
        String isim = scan.next();
        char karakter='s';

        if (isim.length() == 3) {
            System.out.println(isim.charAt(0)==isim.charAt(1)&&isim.charAt(0)==isim.charAt(2)?
                    "Isim ayni  karakterlere sahiptir":"Dizenin benzersiz karakterleri var");

        }else
            System.out.println("3 karakterden fazla giris yapamazsiniz");
    }
}