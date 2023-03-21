
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        System.out.print("birinci sayiyi giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        sayi2 = scanner.nextInt();
        System.out.println("sayi1: " + sayi1 + " sayi2: " + sayi2);
        int gecici=sayi1;
        sayi1=sayi2;
        sayi2=gecici;
        
        System.out.println("degistirilmis sayi1: " + sayi1 + " degistirilmis sayi2: " + sayi2);
        
        
    }
}
