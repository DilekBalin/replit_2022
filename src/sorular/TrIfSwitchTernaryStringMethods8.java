package sorular;

import java.util.Scanner;

public class TrIfSwitchTernaryStringMethods8 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim=scan.next();
        if (isim.length()>=2){
            System.out.println(isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2));

        }else{
            System.out.println("Isim en az 2 karakterli olmali");
        }
    }
}
