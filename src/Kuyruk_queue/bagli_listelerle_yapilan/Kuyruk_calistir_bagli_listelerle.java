package Kuyruk_queue.bagli_listelerle_yapilan;

import java.util.Scanner;

public class Kuyruk_calistir_bagli_listelerle {
    Scanner scanner = new Scanner(System.in);
    int data, uzunluk, input;

    public void calistir() {
        System.out.println("Kuyruk - Queue, Bağlı Listelerle Yapılan.");
        Kuyruk_yonetim_bagli_listelerle yeni_Kuyruk = new Kuyruk_yonetim_bagli_listelerle();
        while (input != 9) {
            System.out.println();
            System.out.println("Kuyruğa Ekelemek için: 1 ");
            System.out.println("Kuyruktan Çıkarmak için: 2 ");
            System.out.println("Kuyruğu Yazdırmak için: 3 ");
            System.out.println("Programdan Çıkış Yapmak için: 9 ");
            System.out.print("Yapmak İstediğiniz işlemi seçin: ");
            input = scanner.nextInt();
            if (input == 1) {
                yeni_Kuyruk.kuyrugaEkle_enQueue();
            } else if(input == 2){
            yeni_Kuyruk.kuyruktanCikar_deQueue();
            } else if(input == 3){
            yeni_Kuyruk.kuyruk_Yazdir();
            }
        }
    }

}
