import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input areas for int & double
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        // converting int to double
        double tamSayiOndalikli = (double) tamSayi;

        // converting double to int
        int ondalikliSayiTam = (int) ondalikliSayi;

        // results
        System.out.println("Tam sayıdan ondalıklı sayıya dönüşüm: " + tamSayiOndalikli);
        System.out.println("Ondalıklı sayıdan tam sayıya dönüşüm: " + ondalikliSayiTam);
    }
}
