package Bagli_Listeler_Linkend_List.Tek_yonlu_Dairesel_Bagli_Liste;

public class Tek_yonlu_dairesel_liste_yonetim {
    Node head;
    Node tail;
    int elemanSayisi = 0;

    public void listeYazdir() {
        Node temp;
        temp = head;
        int counterIndex = 0;
        System.out.println();
        while (counterIndex < elemanSayisi) {
            System.out.println(counterIndex + " indexli düğümün datası: " + temp.data);
            counterIndex++;
            temp = temp.next;
        }
        System.out.println();
    }

    public void listeYazdirDaireselDeneme() {
        Node temp;
        temp = head;
        int counterIndex = 0;
        System.out.println();
        while (counterIndex < elemanSayisi * 2) {
            System.out.println(counterIndex + " indexli düğümün datası: " + temp.data);
            counterIndex++;
            temp = temp.next;
        }
        System.out.println();
    }

    void enBasaEkle(Node node) {
        head = node;
        tail = node;
        tail.next = head;
    }

    public void basaEkle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            enBasaEkle(newNode);

        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        elemanSayisi++;
        listeYazdir();
    }

    public void ortayaEkle(int data, int hangiIndex) {

        if (hangiIndex == 0) {
            basaEkle(data);
        } else {
            Node temp;
            temp = head;
            int counterIndex = 0;
            Node newNode = new Node(data);
            for (int i = 0; i < elemanSayisi; i++) {
                if (counterIndex == hangiIndex - 1) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                counterIndex++;
                temp = temp.next;
            }
            elemanSayisi++;
        }

        listeYazdir();
    }

    public void sonaEkle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            enBasaEkle(newNode);
        } else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
        elemanSayisi++;
        listeYazdir();
    }

    public void bastanSil() {
        if (head != null) {
            head = head.next;
            tail.next = head;
            elemanSayisi--;
        } else {
            System.out.println("Listede Eleman Kalmadı!");
        }
        listeYazdir();
    }

    public void ortadanSil(int hangiIndex) {
        if (hangiIndex == 0) {
            bastanSil();
        } else {
            Node temp;
            temp = head;
            int counterIndex = 0;
            for (int i = 0; i < elemanSayisi; i++) {
                if (counterIndex == hangiIndex - 1) {
                    temp.next = temp.next.next;
                    break;
                }
                counterIndex++;
                temp = temp.next;
            }
            elemanSayisi--;
        }
        listeYazdir();
    }

    public void sondanSil() {
        if (head != null) {
            Node temp = head;
            for (int i = 0; i < elemanSayisi; i++) {
                if (temp.next == tail) {
                    temp.next.next = null;
                    temp.next = head;
                    tail = temp;
                }
                temp = temp.next;
            }
            elemanSayisi--;
        } else {
            System.out.println("Listede Eleman Kalmadı!");
        }
        listeYazdir();
    }
}
