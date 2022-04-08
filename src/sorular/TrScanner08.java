package sorular;

import java.util.Scanner;

public class TrScanner08 {
    /*Kullanıcıdan üç basamaklı bir sayı girmesini
    ve bu sayının basamaklarının toplamını bulmasını isteyin.
Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("uc basamkli bir tam sayi giriniz= ");
        int sayi=scanner.nextInt();

        int r= 0;
        int rakamlarToplami=0;

       r=sayi%10;
       rakamlarToplami+=r;
        sayi/=10;

        r=sayi%10;
        rakamlarToplami+=r;
        sayi/=10;

        r=sayi%10;
        rakamlarToplami+=r;
        sayi/=10;


        System.out.println(rakamlarToplami);



    }
}
