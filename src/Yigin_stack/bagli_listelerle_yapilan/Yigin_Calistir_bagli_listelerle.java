package Yigin_stack.bagli_listelerle_yapilan;

import java.util.Scanner;

public class Yigin_Calistir_bagli_listelerle {
    int size;
    int input = 0;
    Scanner scanner = new Scanner(System.in);

    public Yigin_Calistir_bagli_listelerle() {
        System.out.println("Dizi Uzunluğunuzu Girin: ");
        this.size = scanner.nextInt();
    }

    public void calistir() {
        System.out.println("Yığın - Stack, Bağlı Listelerle Yapılan");

        Yigin_yonetim_bagli_listelerle yigin_Stack = new Yigin_yonetim_bagli_listelerle(size);

        while (input != 9) {
            System.out.println();
            System.out.println("Yığına Eleman Eklemek için: 1");
            System.out.println("Yığından Eleman Çıkarmak için: 2");
            System.out.println("Yığını yazdırmak için: 3");
            System.out.println("Programı Kapatmak için: 9");
            System.out.print("Yapmak İstediğiniz işlemi seçin: ");
            input = scanner.nextInt();
            if (input == 1) {
                yigin_Stack.yiginEkle_Push();

            } else if (input == 2) {
                yigin_Stack.yigindanCikar_Pop();

            }else if (input == 3) {
                yigin_Stack.yigin_yazdir();
             }
            System.out.println();
        }
        scanner.close();
    }
}
