import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("N sayısını giriniz : ");

        int n = girdi.nextInt();
        double sonuc = 0.0;

        for (int i=1;i<=n;i++){
            sonuc += (1.0/i);
        }

        System.out.println(sonuc);
    }
}
