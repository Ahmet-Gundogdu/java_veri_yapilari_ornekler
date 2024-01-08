package Kuyruk_queue.dizilerle_yapilan;

public class kuyruk_yonetim_dizilerle {
    int [] dizi;
    int size;
    int front;//ilk eleman
    int rear; // son eleman
    kuyruk_yonetim_dizilerle(int diziUzunlugu){
        this.size = diziUzunlugu;
        dizi = new int [size];
        front = 0;
        rear = -1;

    }
    public void kuyrugaEkle_enQueue(int data){
        if(isFull()){
            System.out.println();
            System.out.println("Kuyruk tamamen dolu!");
        }else{
            rear++;
            dizi[rear] = data;
            System.out.println();
            System.out.println(dizi[rear] + " kuyruğa eklendi.");
        }
        System.out.println();
    }
    public void kuyruktanCikar_deQueue(){
        if(isEmpty()){
            System.out.println();
            System.out.println("Kuyruk tamamen boş!");
        }else{
            
            int sayi = dizi[front];
            for (int i = 1; i <= rear; i++) {
                dizi[i-1] = dizi[i];
            }
            rear--;
            System.out.println();
            System.out.println(sayi +" kuyruktan çıkartıldı.");
        }
        System.out.println();
    }
    private boolean isFull() {
        return rear == size-1;
    }
    private boolean isEmpty() {
        return rear==-1;
    }

}
