package Bagli_Listeler_Linkend_List.Cift_yonlu_Dairesel_Bagli_Liste;

import java.util.Scanner;

public class C_D_Bagli_Calistir {
    int input, data, index;

    public void calistir() {
        System.out.println("Çift Yönlü Dairesel Bağlı Liste");
        Cift_yonlu_dairesel_liste_yonetim Cift_Yonlu__Dairesel_Liste = new Cift_yonlu_dairesel_liste_yonetim();
        Scanner scanner = new Scanner(System.in);

        while (input != 9) {
            System.out.println("Listenin Başına Eleman Eklemek için: 1");
            System.out.println("Listenin Ortasınana Eleman Eklemek için: 2");
            System.out.println("Listenin Sonuna Eleman Eklemek için: 3");
            System.out.println("Listenin Başından Eleman Silmek için: 4");
            System.out.println("Listenin Ortasından Eleman Silmek için: 5");
            System.out.println("Listenin Sonundan Eleman Silmek için: 6");
            System.out.println("Listeyi Yazdırmak için: 7");
            System.out.println("Dairesel deneme Yazdırmak için: 8");
            System.out.println("Programdan Çıkış Yapmak için: 9");
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                Cift_Yonlu__Dairesel_Liste.basaEkle(data);
            } else if (input == 2) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                System.out.println("Hangi indexten eleman eklemek istiyorsunuz: ");
                index = scanner.nextInt();
                Cift_Yonlu__Dairesel_Liste.ortayaEkle(data, index);

            } else if (input == 3) {
                System.out.println("Sayı türünde verinizi giriniz: ");
                data = scanner.nextInt();
                Cift_Yonlu__Dairesel_Liste.sonaEkle(data);

            } else if (input == 4) {
                Cift_Yonlu__Dairesel_Liste.bastanSil();

            } else if (input == 5) {
                System.out.println("Hangi indexten eleman silmek istiyorsunuz: ");
                index = scanner.nextInt();
                Cift_Yonlu__Dairesel_Liste.ortadanSil(index);
            } else if (input == 6) {
                Cift_Yonlu__Dairesel_Liste.sondanSil();

            } else if (input == 7) {
                System.out.println("Soldan sağa yazdırmak için: 0");
                System.out.println("Sağdan sola yazdırmak için: 1");
                int yon = scanner.nextInt();
                Cift_Yonlu__Dairesel_Liste.listeYazdir(yon);

            } else if (input == 8) {
                System.out.println("Soldan sağa yazdırmak için: 0");
                System.out.println("Sağdan sola yazdırmak için: 1");
                int yon = scanner.nextInt();
                Cift_Yonlu__Dairesel_Liste.listeYazdirDaireselDeneme(yon);

            }
        }
        scanner.close();

    }
}
