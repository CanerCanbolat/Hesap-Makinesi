import java.text.BreakIterator;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main (String[] args) {
        double n1,n2 ;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        int sec = input.nextInt();
        switch (sec) {
            case 1 : System.out.print("Toplam = "+(n1+n2));
            break;
            case 2 : System.out.print("Çıkarma = "+(n1-n2));
            break;
            case 3 : System.out.print("Çarpma = "+(n1*n2));
            break;
            case 4 : System.out.print( n2 ==0 ? "Sayı 0'a bölünemez !" : "Bölme ="+(n1/n2));
        }

    }
}
