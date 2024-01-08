package Kuyruk_queue.dizilerle_yapilan;

import java.util.Scanner;

public class Kuyruk_Calistir_dizilerle {
    int size;
    int input = 0;
    Scanner sscanner = new Scanner(System.in);

    public Kuyruk_Calistir_dizilerle() {
        System.out.println("Dizi Uzunluğunuzu Girin: ");

        this.size = sscanner.nextInt();
    }

    public void calistir() {
        System.out.println("Kuyruk - Queue, Dizilerle Yapılan");

        kuyruk_yonetim_dizilerle kuyruk_Queue = new kuyruk_yonetim_dizilerle(size);

        while (input != 9) {
            System.out.println("Kuyruğa Eleman Eklemek için: 1");
            System.out.println("Kuyruktan Eleman Çıkarmak için: 2");
            System.out.println("Programı Kapatmak için: 9");
            System.out.print("Yapmak İstediğiniz işlemi seçin: ");
            input = sscanner.nextInt();
            if (input == 1) {
                System.out.println("Sayı türünde eklemek istediğiniz değeri girin: ");
                int data = sscanner.nextInt();
                kuyruk_Queue.kuyrugaEkle_enQueue(data);

            } else if (input == 2) {
                kuyruk_Queue.kuyruktanCikar_deQueue();

            }
        }
        sscanner.close();
    }

}
