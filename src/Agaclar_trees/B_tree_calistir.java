package Agaclar_trees;

import java.util.Scanner;

public class B_tree_calistir {
    Scanner scanner = new Scanner(System.in);
    int input, data = 0;

    public void calistir() {
        System.out.println("İkili Arama Ağacı.");
        B_tree_yonetim Binary_search = new B_tree_yonetim();
        while (input != 9) {
            System.out.println();
            System.out.println("Ağaca düğüm eklemek için: 1");
            System.out.println("Ağacı preOrder (Kök-sol-sağ) gezmek için: 2");
            System.out.println("Ağacı inOrder (sol-Kök-sağ) gezmek için: 3");
            System.out.println("Ağacı postOrder (sol-sağ-Kök) gezmek için: 4");
            System.out.println("Ağacın yüksekliği için: 5");
            System.out.println("Ağacın eleman Sayısı için: 6");
            System.out.println("Ağaçtan eleman silmek için: 7");
            System.out.println("Ağacın Tüm Özelliklerini Görmek İçin: 8");
            System.out.println("Çıkış Yapmak için: 9");
            System.out.print("Yapmak istediğiniz işlemin kodunu girin:  ");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.print("Eklemek istediğinz sayı türündeki veriyi yazınız:  ");
                data = scanner.nextInt();
                Binary_search.root = Binary_search.dugumEkle(Binary_search.root, data);

            } else if (input == 2) {
                System.out.println();
                System.out.print("=> PreOrder   : ");
                Binary_search.preOrder_onceKok(Binary_search.root);
                System.out.println();

            } else if (input == 3) {
                System.out.println();
                System.out.print("=> İnOrder    : ");
                Binary_search.inOrder_ortadaKok(Binary_search.root);
                System.out.println();

            } else if (input == 4) {
                System.out.println();
                System.out.print("=> PostOrder   : ");
                Binary_search.postOrder_ensonKok(Binary_search.root);

                System.out.println();
            } else if (input == 5) {
                System.out.println("=> Ağacın Yüksekliği: " + Binary_search.yukseklikBul(Binary_search.root));

            } else if (input == 6) {
                System.out.println("=> Ağacın Eleman Sayısı: " + Binary_search.elemanSayisiBul(Binary_search.root));

            } else if (input == 7) {
                System.out.print("Silmek istediğiniz datayı yazın: ");
                data = scanner.nextInt();
                Binary_search.root = Binary_search.elemanSil(Binary_search.root, data);
                System.out.println("Silme İşlemi Sonrası Ağaç Yapısı: ");
                System.out.print("=> PreOrder   : ");
                Binary_search.preOrder_onceKok(Binary_search.root);
                System.out.println();
                System.out.print("=> İnOrder    : ");
                Binary_search.inOrder_ortadaKok(Binary_search.root);
                System.out.println();
                System.out.print("=> PostOrder   : ");
                Binary_search.postOrder_ensonKok(Binary_search.root);
                System.out.println();

            } else if (input == 8) {
                System.out.println();
                System.out.print("=> PreOrder   : ");
                Binary_search.preOrder_onceKok(Binary_search.root);
                System.out.println();
                System.out.print("=> İnOrder    : ");
                Binary_search.inOrder_ortadaKok(Binary_search.root);
                System.out.println();
                System.out.print("=> PostOrder   : ");
                Binary_search.postOrder_ensonKok(Binary_search.root);
                System.out.println();
                System.out.println("=> Ağacın Yüksekliği: " + Binary_search.yukseklikBul(Binary_search.root));
                System.out.println("=> Ağacın Eleman Sayısı: " + Binary_search.elemanSayisiBul(Binary_search.root));
            }
        }
        scanner.close();
    }
}
