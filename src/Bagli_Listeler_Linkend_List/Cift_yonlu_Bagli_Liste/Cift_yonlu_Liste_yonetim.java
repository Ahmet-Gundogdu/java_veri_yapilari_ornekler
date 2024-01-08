package Bagli_Listeler_Linkend_List.Cift_yonlu_Bagli_Liste;

public class Cift_yonlu_Liste_yonetim {
    Node head;
    Node tail;
    int elemanSayisi = 0;

    public void listeYazdir(int yon) {

        if (yon == 0) { // soldan sağa
            Node temp;
            temp = head;
            int counterIndex = 0;
            System.out.println();
            while (temp != null) {
                System.out.println( "=> "+counterIndex + " indexli düğümün datası: " + temp.data);
                counterIndex++;
                temp = temp.next;
            }
            System.out.println();
        } else if (yon == 1) { // sağdan sola
            Node temp;
            temp = tail;
            int counterIndex = elemanSayisi-1;
            System.out.println();
            while (temp != null) {
                System.out.println("<= "+counterIndex + " indexli düğümün datası: " + temp.data);
                counterIndex--;
                temp = temp.previous;
            }
            System.out.println();
        }
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
            head.previous = newNode;
            head = newNode;
        }
        elemanSayisi++;
        listeYazdir(0);
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
                    temp.next.previous = newNode;
                    temp.next = newNode;
                    newNode.previous = temp;
                    break;
                }
                counterIndex++;
                temp = temp.next;
            }
            elemanSayisi++;
        }
        
        listeYazdir(0);
    }

    public void sonaEkle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            enBasaEkle(newNode);
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        elemanSayisi++;
        listeYazdir(0);
    }

    public void bastanSil() {
        if (head != null) {
            head.next.previous = null;
            head = head.next;
            elemanSayisi--;
        } else {
            System.out.println("Listede Eleman Kalmadı!");
        }
        listeYazdir(0);
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
                    temp.next.next.previous = temp;
                    temp.next = temp.next.next;
                    break;
                }
                counterIndex++;
                temp = temp.next;
            }
            elemanSayisi--;
        }
        listeYazdir(0);
    }

    public void sondanSil() {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                if (temp.next == tail) {
                    temp.next.previous = null;
                    temp.next = null;
                    tail = temp;
                    break;
                }
                temp = temp.next;
            }
            elemanSayisi--;
        } else {
            System.out.println("Listede Eleman Kalmadı!");
        }
        
        listeYazdir(0);
    }

}
