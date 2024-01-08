package javanin_kendi_linked_list_kutuphanesi.yigin_Stack;

import java.util.Scanner;

public class java_liste_yigin_calistir {
    int input, data = 0;
    Scanner scanner = new Scanner(System.in);

    public void calistir() {
        System.out.print("Java Linked List Yığın-Stack'in uzunluğunu girin: ");
        int diziUzunluk = scanner.nextInt();
        java_liste_yigin_yonetim java_yigin = new java_liste_yigin_yonetim(diziUzunluk);
        while (input != 9) {
            System.out.println();
            System.out.println("Yığına Eleman Eklemek için: 1");
            System.out.println("Yığından Çıkarmak için: 2");
            System.out.println("Yığını Yazdırmak için: 3");
            System.out.println("Çıkmak için: 9");
            System.out.print("Yapacağınız işlem numarasını girin:  ");
            input = scanner.nextInt();

            if (input == 1) {
                System.out.print("Eklemek istediğiniz sayıyı girin: ");
                data = scanner.nextInt();
                java_yigin.eleman_ekle_Push(data);
            } else if (input == 2) {
                java_yigin.eleman_cikar_Pop();
            } else if (input == 3) {
                java_yigin.yigin_Yazdir();
            }
        }
    }
}
