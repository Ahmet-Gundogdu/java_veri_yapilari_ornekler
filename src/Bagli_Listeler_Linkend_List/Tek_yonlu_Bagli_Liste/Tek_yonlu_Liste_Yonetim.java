package Bagli_Listeler_Linkend_List.Tek_yonlu_Bagli_Liste;

public class Tek_yonlu_Liste_Yonetim {
    Node head;
    Node tail;
    int elemanSayisi = 0;

    public void listeYazdir() {
        Node temp;
        temp = head;
        int counterIndex = 0;
        System.out.println();
        while (temp != null) {
            System.out.println(counterIndex + " indexli düğümün datası: " + temp.data);
            counterIndex++;
            temp = temp.next;
        }
        System.out.println();
    }

    void enBasaEkle(Node node) {
        head = node;
        tail = node;
    }

    public void basaEkle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            enBasaEkle(newNode);

        } else {
            newNode.next = head;
            head = newNode;
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
            while (temp != null) {
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
            tail.next = newNode;
            tail = newNode;
        }
        elemanSayisi++;
        listeYazdir();
    }

    public void bastanSil() {
        if (head != null) {
            head = head.next;
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
            while (temp != null) {
                if (counterIndex == hangiIndex - 1) {
                    temp.next= temp.next.next;
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
            while (temp != null) {
                if (temp.next == tail) {
                    temp.next = null;
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
