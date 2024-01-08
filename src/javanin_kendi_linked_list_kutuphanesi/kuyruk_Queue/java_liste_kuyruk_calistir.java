package javanin_kendi_linked_list_kutuphanesi.kuyruk_Queue;

import java.util.Scanner;

public class java_liste_kuyruk_calistir {
    int input, data = 0;
    Scanner scanner = new Scanner(System.in);

    public void calistir() {
        System.out.print("Java Linked List Kuyruk-Queue'nin uzunluğunu girin: ");
        int diziUzunluk = scanner.nextInt();
        java_liste_kuyruk_yonetim java_kuyruk = new java_liste_kuyruk_yonetim(diziUzunluk);
        while (input != 9) {
            System.out.println();
            System.out.println("Kuyruğa Eleman Eklemek için: 1");
            System.out.println("Kuyruktan Çıkarmak için: 2");
            System.out.println("Kuyruğu Yazdırmak için: 3");
            System.out.println("Çıkmak için: 9");
            System.out.print("Yapacağınız işlem numarasını girin:  ");
            input = scanner.nextInt();

            if (input == 1) {
                System.out.print("Eklemek istediğiniz sayıyı girin: ");
                data = scanner.nextInt();
                java_kuyruk.kuyruk_eleman_ekle_enQueue(data);
            } else if (input == 2) {
                java_kuyruk.kuyruk_eleman_cikar_deQueue();
            } else if (input == 3) {
                java_kuyruk.kuyruk_Yazdir();
            }
        }
    }
}
