package Yigin_stack.dizilerle_yapilan;

import java.util.Scanner;

public class Yigin_Calistir_dizilerle {
    int size;
    int input = 0;
    Scanner scanner = new Scanner(System.in);

    public Yigin_Calistir_dizilerle() {
        System.out.println("Dizi Uzunluğunuzu Girin: ");
        this.size = scanner.nextInt();
    }

    public void calistir() {
        System.out.println("Yığın - Stack, Dizilerle Yapılan");

        Yigin_yonetim_dizilerle yigin_Stack = new Yigin_yonetim_dizilerle(size);

        while (input != 9) {
            System.out.println();
            System.out.println("Yığına Eleman Eklemek için: 1");
            System.out.println("Yığından Eleman Çıkarmak için: 2");
            System.out.println("Programı Kapatmak için: 9");
            System.out.print("Yapmak İstediğiniz işlemi seçin: ");
            input = scanner.nextInt();
            if (input == 1) {
                yigin_Stack.yiginEkle_Push();

            } else if (input == 2) {
                yigin_Stack.yigindanCikar_Pop();

            }
            System.out.println();
        }
        scanner.close();
    }
}
