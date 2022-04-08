package sorular;

public class TrForwhile4 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
         */

    int sayi=6;
    int faktoriyel=1;

    for(int i=1;i<=sayi;i++){
        faktoriyel*=i;
        System.out.println(faktoriyel);
    }
        System.out.println("6 sayisinin faktoriyeli= " +faktoriyel);
    }
}
