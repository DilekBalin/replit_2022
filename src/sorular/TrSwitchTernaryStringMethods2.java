package sorular;

import java.util.Locale;
import java.util.Scanner;

public class TrSwitchTernaryStringMethods2 {
    public static void main(String[] args) {
        /*
         Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

        Input :
        John White
        1234234534561478
        Output :
        Name :
        J*** W****
        CCN : **** **** **** 1478
        Ilk Harfler Buyuk harf ile baslamalidir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adinizi yaziniz: ");
        String name= scanner.nextLine().toUpperCase();
        System.out.print("Soy adinizi yaziniz: ");
        String surName=scanner.nextLine().toUpperCase();
        System.out.print("Kredi karti numaranizi yaziniz: ");
        String CCN=scanner.next();

        System.out.println(name.replaceAll((name.substring(1,name.length())),"***"));
        System.out.println(surName.replaceAll((surName.substring(1,surName.length())),"***"));
        System.out.println(CCN.replaceAll((CCN.substring(0,CCN.length()-4)),"**** **** ****"));
    }
}
