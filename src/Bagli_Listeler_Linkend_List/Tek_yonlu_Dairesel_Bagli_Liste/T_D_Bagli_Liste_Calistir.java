package Bagli_Listeler_Linkend_List.Tek_yonlu_Dairesel_Bagli_Liste;

import java.util.Scanner;

public class T_D_Bagli_Liste_Calistir {
int input, data, index;

    public void calistir() {
        System.out.println("Tek Yönlü Dairesel Bağlı Liste");
        Tek_yonlu_dairesel_liste_yonetim Tek_Yonlu_Dairesel_Liste = new Tek_yonlu_dairesel_liste_yonetim();
        Scanner scanner = new Scanner(System.in);

        while (input != 9) {
            System.out.println("Listenin Başına Eleman Eklemek için: 1");
            System.out.println("Listenin Ortasınana Eleman Eklemek için: 2");
            System.out.println("Listenin Sonuna Eleman Eklemek için: 3");
            System.out.println("Listenin Başından Eleman Silmek için: 4");
            System.out.println("Listenin Ortasından Eleman Silmek için: 5");
            System.out.println("Listenin Sonundan Eleman Silmek için: 6");
            System.out.println("Listeyi Yazdırmak için: 7");
            System.out.println("Dairesel deneme Listeyi Yazdırmak için: 8");
            System.out.println("Programdan Çıkış Yapmak için: 9");
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                Tek_Yonlu_Dairesel_Liste.basaEkle(data);
            } else if (input == 2) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                System.out.println("Hangi indexten eleman eklemek istiyorsunuz: ");
                index = scanner.nextInt();
                Tek_Yonlu_Dairesel_Liste.ortayaEkle(data, index);

            } else if (input == 3) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                Tek_Yonlu_Dairesel_Liste.sonaEkle(data);

            } else if (input == 4) {
                Tek_Yonlu_Dairesel_Liste.bastanSil();

            } else if (input == 5) {
                System.out.println("Hangi indexten eleman silmek istiyorsunuz: ");
                index = scanner.nextInt();
                Tek_Yonlu_Dairesel_Liste.ortadanSil(index);
            } else if (input == 6) {
                Tek_Yonlu_Dairesel_Liste.sondanSil();

            } else if (input == 7) {
                Tek_Yonlu_Dairesel_Liste.listeYazdir();

            } else if (input == 8) {
                Tek_Yonlu_Dairesel_Liste.listeYazdirDaireselDeneme();

            }
        }
        scanner.close();

    }
}
