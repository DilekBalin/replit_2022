package sorular;

import java.util.Scanner;

public class TrScanner04 {

    /*Kullanıcıya günde ne kadar çay içtiğini ve
    ne kadar şeker kullandığını sorun.
    Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
1 şeker = 1.7 gr
Örnek Çıktı:
Yılda 12.41 kg şeker kullanıyor.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gunde ne kadar cay ictiginizi yazin");
        double cay=scanner.nextDouble();

        System.out.println("Ne kadar seker kullandiginizi yazin");
        double seker=scanner.nextInt();

        seker=1.7;
        Double sonuc=(1.7*seker*cay*365)/1000;
        System.out.println("Yilda "+sonuc+" kg seker kullaniyor.");

    }

}
