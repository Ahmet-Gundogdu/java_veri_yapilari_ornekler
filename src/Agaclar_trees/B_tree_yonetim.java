package Agaclar_trees;

public class B_tree_yonetim {
    Node root;

    public B_tree_yonetim() {
        this.root = null;
    }

    public Node yeniKok(int data) {
        root = new Node(data);
        System.out.println("=>! " + data + " Ağaca Eklendi. ");
        return root;
    }

    public Node dugumEkle(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = dugumEkle(root.left, data);
            } else {
                root.right = dugumEkle(root.right, data);
            }
        } else {
            root = yeniKok(data);
        }
        return root;
    }

    public void preOrder_onceKok(Node root) { // kök-sol-sağ
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder_onceKok(root.left);
            preOrder_onceKok(root.right);
        }
    }

    public void inOrder_ortadaKok(Node root) { // sol-kök-sağ
        if (root != null) {
            inOrder_ortadaKok(root.left);
            System.out.print(root.data + " ");
            inOrder_ortadaKok(root.right);
        }
    }

    public void postOrder_ensonKok(Node root) {// sol-sağ-kök
        if (root != null) {
            postOrder_ensonKok(root.left);
            postOrder_ensonKok(root.right);
            System.out.print(root.data + " ");
        }
    }

    public int yukseklikBul(Node root) {
        if (root == null) {
            return 0;
        } else {
            int sol, sag = 0;
            sol = yukseklikBul(root.left);
            sag = yukseklikBul(root.right);
            if (sol > sag) {
                return sol + 1;
            } else {
                return sag + 1;
            }
        }

    }

    public int elemanSayisiBul(Node root) {
        if (root == null) {
            return 0;
        } else {
            return elemanSayisiBul(root.left) + 1 + elemanSayisiBul(root.right);
        }
    }

    public Node elemanSil(Node root, int data) {
        Node t1, t2;
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            if (root.left == root.right) {// Silinecek düğümün sağı ve solu boşsa = Yaprak Düğüm
                root = null;
                return null;
            } else if (root.left == null) {// Silinecek düğümün sağı doluysa
                t1 = root.right;
                return t1;
            } else if (root.right == null) { // Silinecek düğümün solu doluysa
                t1 = root.left;
                return t1;
            } else { // Silinecek düğümün sağı ve solu doluysa, sağdaki düğümü ebevyn yapar ve
                     // kaydırma işlemlerini uygular.
                t1 = t2 = root.right;
                while (t1.left != null) {
                    t1 = t1.left;
                }
                t1.left = root.left;
                if (data == this.root.data) {
                    System.out.println();
                    System.out.println("Tepe Kök Düğüm silindi! \nYeni Kök: " + t2.data);
                }
                return t2;
            }

        } else {
            if (data < root.data) { // Silenecek datanın olduğu düğümü arama kısmı
                root.left = elemanSil(root.left, data);
            } else {
                root.right = elemanSil(root.right, data);
            }
            return root;
        }
    }

}
