package javanin_kendi_linked_list_kutuphanesi.yigin_Stack;

import java.util.LinkedList;

public class java_liste_yigin_yonetim {// LİFO Son Giren İlk Çıkar
    int elemanSayisi, diziBoyutu = 0;
    LinkedList<Integer> yeni_Yigin = new LinkedList<Integer>();

    public java_liste_yigin_yonetim(int diziBoyutu) {
        this.diziBoyutu = diziBoyutu;
    }

    public void yigin_Yazdir() {
        System.out.println();
        System.out.print("=>! Yığındaki Elemanlar : ");
        for (int i : yeni_Yigin) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void eleman_ekle_Push(int data) {
        System.out.println();
        if (elemanSayisi >= diziBoyutu) {
            System.err.println("=>! Yığın Tamamen Dolu! !<=");
        } else {
            yeni_Yigin.addFirst(data);
            elemanSayisi++;
        }
    }

    public void eleman_cikar_Pop() {
        System.out.println();
        if (yeni_Yigin.isEmpty()) {
            System.err.println("=>! Yğın Tamamen Boş! !<=");
        } else {
            int cikan = yeni_Yigin.removeFirst();
            System.out.println("=>! Çıkan Eleman : " + cikan + " !<=");
            elemanSayisi--;
        }
    }

}
