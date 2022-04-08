package sorular;

public class TrSyso_04 {
    /*Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.

r=7;
Pi=3.14

Ipucu:

Dairenin Cevresi : 2Pir
Dairenin Alani : Pirr
Ornek Cikti:
43.96
153.86


     */
    public static void main(String[] args) {
        int r=7;
        double pi=3.14;
        System.out.println("Dairenin cevresi= "+(2*pi*r) );
        System.out.println("Dairenin alani= " + (pi * r * r));

    }
}