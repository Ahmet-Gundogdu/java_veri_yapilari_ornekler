package Yigin_stack.dizilerle_yapilan;

import java.util.Scanner;

public class Yigin_yonetim_dizilerle {
    int[] dizi;
    int size;
    int indis;
    Scanner scanner = new Scanner(System.in);

    public Yigin_yonetim_dizilerle(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;
    }

    public void yiginEkle_Push() {
        if (isFull()) {
            System.out.println("=>! Yığın dizisi Tamamen Dolu! !<=");
        } else {
            System.out.print("Eklemek istediğiniz sayısal veriyi girin: ");
            int veri = scanner.nextInt();
            indis++;
            dizi[indis] = veri;
            System.out.println("=>! Eklendi-Pop(): " + dizi[indis] + " !<=");
        }
    }

    public void yigindanCikar_Pop() {
        if (isEmpty()) {
            System.out.println("=>! Yığın dizisi tamamen Boş! !<=");
        } else {

            System.out.println("=>! Çıkarıldı-Push() " + dizi[indis--] + " !<=");
        }
    }

    private boolean isFull() {
        return indis == size - 1;
    }

    private boolean isEmpty() {
        return indis == -1;
    }

}
