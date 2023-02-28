import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, number=0, total=0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        sayi= input.nextInt();

        for(int i=0; i<=sayi; i++){
            if((i%3==0) && (i%4==0)){
                number++;
                total+=i;
            }
        }

        ortalama=total/number;
        System.out.println("Sayıların Ortalaması"+ortalama);

    }
}
