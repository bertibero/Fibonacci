import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Fibonaccinin kaç adımını istiyorsunuz ? :");
        n = input.nextInt();

        int sayi = 0, sayi2=1;
        for(int i=1; i<=n; i++){
            System.out.print(sayi+" ");
            int toplam = sayi + sayi2;
            sayi = sayi2;
            sayi2 = toplam;
        }
    }
}