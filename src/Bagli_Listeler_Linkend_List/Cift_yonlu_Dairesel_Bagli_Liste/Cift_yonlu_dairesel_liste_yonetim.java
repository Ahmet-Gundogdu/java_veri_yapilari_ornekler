package Bagli_Listeler_Linkend_List.Cift_yonlu_Dairesel_Bagli_Liste;

public class Cift_yonlu_dairesel_liste_yonetim {
    Node head;
    Node tail;
    int elemanSayisi = 0;

    public void listeYazdir(int yon) {

        if (yon == 0) { // soldan sağa
            Node temp;
            temp = head;
            int counterIndex = 0;
            System.out.println();
            while (counterIndex < elemanSayisi) {
                System.out.println("=> " + counterIndex + " indexli düğümün datası: " + temp.data);
                counterIndex++;
                temp = temp.next;
            }
            System.out.println();
        } else if (yon == 1) { // sağdan sola
            Node temp;
            temp = tail;
            int counterIndex = elemanSayisi - 1;
            System.out.println();
            while (0 <= counterIndex) {
                System.out.println("<= " + counterIndex + " indexli düğümün datası: " + temp.data);
                counterIndex--;
                temp = temp.previous;
            }
            System.out.println();
        }
    }

    public void listeYazdirDaireselDeneme(int yon) {

        if (yon == 0) { // soldan sağa
            Node temp;
            temp = head;
            int counterIndex = 0;
            System.out.println();
            while (counterIndex < elemanSayisi * 2) {
                System.out.println("=> " + counterIndex + " indexli düğümün datası: " + temp.data);
                counterIndex++;
                temp = temp.next;
            }
            System.out.println();
        } else if (yon == 1) { // sağdan sola
            Node temp;
            temp = tail;
            int counterIndex = (elemanSayisi * 2) - 1;
            System.out.println();
            while (0 <= counterIndex) {
                System.out.println("<= " + counterIndex + " indexli düğümün datası: " + temp.data);
                counterIndex--;
                temp = temp.previous;
            }
            System.out.println();
        }
    }

    void enBasaEkle(Node node) {
        head = node;
        tail = node;
        tail.next = head;
        head.previous = tail;
    }

    public void basaEkle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            enBasaEkle(newNode);

        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            newNode.previous = tail;
            tail.next = head;
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
            newNode.next = head;
            head.previous = newNode;
        }
        elemanSayisi++;
        listeYazdir(0);
    }

    public void bastanSil() {
        if (head != null) {
            head.next.previous = tail;
            head = head.next;
            tail.next = head;
            elemanSayisi--;
        } else {
            System.out.println("Listede Eleman Kalmadı!");
        }
        listeYazdir(0);
    }

    public void ortadanSil(int hangiIndex) {
        if (hangiIndex == 0) {
            bastanSil();
        } else if (hangiIndex == elemanSayisi - 1) {
            sondanSil();
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
                    tail.next = head;
                    head.previous = tail;
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
