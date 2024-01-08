package Kuyruk_queue.bagli_listelerle_yapilan;

import java.util.Scanner;

public class Kuyruk_yonetim_bagli_listelerle {
    Node front;
    Node rear;
    int kuyrukUzunlugu;
    int elemanSayisi;
    Scanner sscanner = new Scanner(System.in);

    public Kuyruk_yonetim_bagli_listelerle() {
        System.out.print("Kuyruk Uzunluğunuzu Giriniz: ");
        this.kuyrukUzunlugu = sscanner.nextInt();
        elemanSayisi = 0;
        front = null;
        rear = null;
    }

    public void kuyruk_Yazdir() {
        System.out.println();
        if(isEmpty()){
            System.out.println("=>! Kuyruk Boş! !<=");
        }else{Node temp = front;
        int sayac = 1;
        System.out.println();
        while (temp != null) {
            System.out.println(sayac + " numaralı kuyruk elemanı: " + temp.data);
            sayac++;
            temp = temp.next;
        }}
    }

    public void kuyrugaEkle_enQueue() {
        System.out.println();
        if (isFull()) {
            System.out.println(" =>! Kuyruk Tamamen Dolu! !<=");
        } else {
            System.out.print("Sayı türünde eklemek istediğiniz veriyi girin: ");
            int data = sscanner.nextInt();

            Node newNode = new Node(data);
            if (isEmpty()) {
                rear = newNode;
                front = newNode;
                System.out.println("=>! "+data + " Kuyruğa İlk Sıradan Eklendi. !<=");
                elemanSayisi++;
            } else {
                rear.next = newNode;
                rear = newNode;

                System.out.println("=>! "+ data + " Kuyruğa Eklendi. !<=");
                elemanSayisi++;
            }
        }

    }

    public void kuyruktanCikar_deQueue() {
        System.out.println();
        if (isEmpty()) {
            System.out.println("=>! Kuyruk Tamamen Boş! !<=");

        } else {
            System.out.println("=>! "+ front.data + " Kuyruktan Çıkarıldı. !<=");
            front = front.next;
            elemanSayisi--;
        }
    }

    private boolean isFull() {
        return kuyrukUzunlugu == elemanSayisi;
    }

    private boolean isEmpty() {
        return elemanSayisi == 0;
    }

}
