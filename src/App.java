import Bagli_Listeler_Linkend_List.Tek_yonlu_Bagli_Liste.T_Bagli_Liste_Calistir;
import Bagli_Listeler_Linkend_List.Tek_yonlu_Dairesel_Bagli_Liste.T_D_Bagli_Liste_Calistir;
import Kuyruk_queue.bagli_listelerle_yapilan.Kuyruk_calistir_bagli_listelerle;
import Kuyruk_queue.dizilerle_yapilan.Kuyruk_Calistir_dizilerle;
import Yigin_stack.bagli_listelerle_yapilan.Yigin_Calistir_bagli_listelerle;
import Yigin_stack.dizilerle_yapilan.Yigin_Calistir_dizilerle;
import Bagli_Listeler_Linkend_List.Cift_yonlu_Bagli_Liste.C_Bagli_Liste_Calistir;
import Bagli_Listeler_Linkend_List.Cift_yonlu_Dairesel_Bagli_Liste.C_D_Bagli_Calistir;

public class App {
    public static void main(String[] args) throws Exception {
        int hangisi;
        /*
         * 0 => Tek Yönlü Bağlı Liste
         * 1 => Çift Yönlü Bağlı Liste
         * 2 => Tek Yönlü Dairesel Bağlı Liste
         * 3 => Çift Yönlü Dairesel Bağlı Liste
         * 4 => Kuyruk - Queue dizilerle yapılan
         * 5 => Kuyruk - Queue bağlı listelerle yapılan
         * 6 => Yığın - Stack dizilerle yapılan
         * 7 => Yığın - Stack bağlı listelerle yapılan
         * 8 => İkili Arama Ağacı - Binary Search Tree
         * 9 => AVL Ağacı - AVL Tree
         */
        hangisi = 7;

        switch (hangisi) {
            case 0:// 👌👍
                tekYonluBagliListe();
                break;
            case 1:// 👌👍
                ciftYonluBagliListe();
                break;
            case 2:// 👌👍
                tekYonluDaireselBagliListe();
                break;
            case 3:// 👌👍
                ciftYonluDaireselBagliListe();
                break;
            case 4:// 👌👍
                kuyruk_Queue_dizilerle();
                break;
            case 5:// 👌👍
                kuyruk_Queue_bagli_listelerle();
                break;
            case 6:// 👌👍
                yigin_Stack_dizilerle();
                break;
            case 7:// 👌👍
                yigin_Stack_bagli_listelerle();
                break;
            case 8:
                ikiliAramaAgaci_BinarySearchTree();
                break;
            case 9:
                avlAgaci_AvlTree();
                break;

            default:
                break;
        }
    }

    public static void tekYonluBagliListe() { // 👌
        T_Bagli_Liste_Calistir tek_yonlu_bagli_liste = new T_Bagli_Liste_Calistir();
        tek_yonlu_bagli_liste.calistir();
    }

    public static void ciftYonluBagliListe() { // 👌
        C_Bagli_Liste_Calistir cift_yonlu_bagli_liste = new C_Bagli_Liste_Calistir();
        cift_yonlu_bagli_liste.calistir();
    }

    public static void tekYonluDaireselBagliListe() { // 👌
        T_D_Bagli_Liste_Calistir tek_yonlu_dairesel_bagli_liste = new T_D_Bagli_Liste_Calistir();
        tek_yonlu_dairesel_bagli_liste.calistir();
    }

    public static void ciftYonluDaireselBagliListe() {// 👌
        C_D_Bagli_Calistir cift_yonlu_dairesel_bagli_liste = new C_D_Bagli_Calistir();
        cift_yonlu_dairesel_bagli_liste.calistir();
    }

    public static void kuyruk_Queue_dizilerle() { // 👌
        Kuyruk_Calistir_dizilerle dizi_Kuyruk = new Kuyruk_Calistir_dizilerle();
        dizi_Kuyruk.calistir();

    }

    public static void kuyruk_Queue_bagli_listelerle() { // 👌
        Kuyruk_calistir_bagli_listelerle liste_Kuyruk = new Kuyruk_calistir_bagli_listelerle();
        liste_Kuyruk.calistir();

    }

    public static void yigin_Stack_dizilerle() {// 👌
        Yigin_Calistir_dizilerle dizi_Yigin = new Yigin_Calistir_dizilerle();
        dizi_Yigin.calistir();

    }

    public static void yigin_Stack_bagli_listelerle() {// 👌
        Yigin_Calistir_bagli_listelerle liste_Yigin = new Yigin_Calistir_bagli_listelerle();
        liste_Yigin.calistir();

    }

    public static void ikiliAramaAgaci_BinarySearchTree() {

    }

    public static void avlAgaci_AvlTree() {

    }
}