import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy, indeks;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre) cinsinden giriniz: " );
            boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
            kilo=input.nextInt();
        indeks= kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz: " +indeks);
    }
}