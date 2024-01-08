package Bagli_Listeler_Linkend_List.Tek_yonlu_Bagli_Liste;

import java.util.Scanner;

public class T_Bagli_Liste_Calistir {
    int input, data, index;

    public void calistir() {
        System.out.println("Tek Yönlü Bağlı Liste");
        Tek_yonlu_Liste_Yonetim Tek_Yonlu_Liste = new Tek_yonlu_Liste_Yonetim();
        Scanner scanner = new Scanner(System.in);

        while (input != 9) {
            System.out.println("Listenin Başına Eleman Eklemek için: 1");
            System.out.println("Listenin Ortasınana Eleman Eklemek için: 2");
            System.out.println("Listenin Sonuna Eleman Eklemek için: 3");
            System.out.println("Listenin Başından Eleman Silmek için: 4");
            System.out.println("Listenin Ortasından Eleman Silmek için: 5");
            System.out.println("Listenin Sonundan Eleman Silmek için: 6");
            System.out.println("Listeyi Yazdırmak için: 7");
            System.out.println("Programdan Çıkış Yapmak için: 9");
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                Tek_Yonlu_Liste.basaEkle(data);
            } else if (input == 2) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                System.out.println("Hangi indexten eleman eklemek istiyorsunuz: ");
                index = scanner.nextInt();
                Tek_Yonlu_Liste.ortayaEkle(data, index);

            } else if (input == 3) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                Tek_Yonlu_Liste.sonaEkle(data);

            } else if (input == 4) {
                Tek_Yonlu_Liste.bastanSil();

            } else if (input == 5) {
                System.out.println("Hangi indexten eleman silmek istiyorsunuz: ");
                index = scanner.nextInt();
                Tek_Yonlu_Liste.ortadanSil(index);
            } else if (input == 6) {
                Tek_Yonlu_Liste.sondanSil();

            } else if (input == 7) {
                Tek_Yonlu_Liste.listeYazdir();

            }
            System.out.println();
        }
        scanner.close();

    }

}
