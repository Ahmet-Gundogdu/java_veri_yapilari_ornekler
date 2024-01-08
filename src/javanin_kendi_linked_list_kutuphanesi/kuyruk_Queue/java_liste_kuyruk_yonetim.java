package javanin_kendi_linked_list_kutuphanesi.kuyruk_Queue;

import java.util.LinkedList;

public class java_liste_kuyruk_yonetim { // FİFO İlk Giren İlk Çıkar
    int elemanSayisi, diziBoyutu = 0;
    LinkedList<Integer> yeni_Kuyruk = new LinkedList<Integer>();

    public java_liste_kuyruk_yonetim(int diziBoyutu) {
        this.diziBoyutu = diziBoyutu;
    }

    public void kuyruk_Yazdir() {
        System.out.println();
        System.out.print("=> Kuyruktaki Elemanlar : ");
        for (int i : yeni_Kuyruk) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void kuyruk_eleman_ekle_enQueue(int data) {
        System.out.println();
        if (elemanSayisi >= diziBoyutu) {
            System.out.println("=>! Kuyruk Tamamen Dolu! !<=");
        } else {
            yeni_Kuyruk.addLast(data);
            elemanSayisi++;
            System.out.println("=>! "+data + " Kuyruğa Eklendi. !<=" );
        }
    }

    public void kuyruk_eleman_cikar_deQueue() {
        System.out.println();
        if (!yeni_Kuyruk.isEmpty()) {
            int cikan = yeni_Kuyruk.removeFirst();
            elemanSayisi--;
            System.out.println("=>! Çıkan Eleman : " + cikan +" !<=");
        } else {
            System.out.println("=>! Kuyruk Tamamen Boş! !<=");
        }
    }

}
