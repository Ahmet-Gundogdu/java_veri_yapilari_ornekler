package Yigin_stack.bagli_listelerle_yapilan;

import java.util.Scanner;

public class Yigin_yonetim_bagli_listelerle {
    int size, elemanSayisi;
    Node top;
    Scanner scanner = new Scanner(System.in);

    public Yigin_yonetim_bagli_listelerle(int size) {
        this.size = size;
        elemanSayisi = 0;
        top = null;
    }

    public void yigin_yazdir() {
        Node temp = top;
        int sayici = 0;
        System.out.println();
        while (temp != null) {
            System.out.println("=>! "+ ++sayici +" sıradaki yığın elemanı: " + temp.data);
            temp= temp.next;
        }
        System.out.println();
    }

    public void yiginEkle_Push() {
        if (isFull()) {
            System.out.println("=>! Yığın tamamen dolu! !<=");
        } else {
            System.out.print("Eklemek istediğiniz sayıyı yazın: ");
            Node newNode = new Node(scanner.nextInt());
            if (isEmpty()) {
                top = newNode;
                elemanSayisi++;
                System.out.println("=>!" + top.data + " Yığına ilk eklenen eleman!");
            } else {
                newNode.next = top;
                top = newNode;
                elemanSayisi++;
                System.out.println("=>!" + top.data + " Yığına eklendi.");
            }
        }
    }

    public void yigindanCikar_Pop() {
        if (isEmpty()) {
            System.out.println("=>! Yığın tamamen boş! !<=");
        } else {
            System.out.println("=>! " + top.data + " yığından çıkarıldı!");
            top = top.next;
            elemanSayisi--;
        }
    }

    private boolean isFull() {
        return elemanSayisi == size;
    }

    private boolean isEmpty() {
        return elemanSayisi == 0;
    }
}
