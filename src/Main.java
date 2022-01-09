import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String dersler[] = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int notlar[] = new int[dersler.length];
        Scanner scan = new Scanner(System.in);
        //System.out.println(notlar.length);
        for(int i = 0; i < dersler.length; i++){
            System.out.println("Lütfen " + dersler[i] + " dersinizin puanını girin: ");
            int not = scan.nextInt();
            /**
             * Not Kontrolü yapıyoruz. O'dan küçük bir not girildiğinde aynı ekranı
             * tekrar göstermek istiyoruz.
             */
            if(not < 0){
                i--;
                System.out.println("Ders notu 0'dan küçük olmamalı.");
                continue;
            }
            notlar[i] = not;
        }
        int toplam = 0;
        for(int i = 0; i < notlar.length; i++){
            toplam += notlar[i];
        }
        int average = toplam/ notlar.length;
        System.out.println("Ortalamanız : " + average);
        String message =  average >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(message);
    }
}
