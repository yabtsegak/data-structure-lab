public class queue {
    int front;
    int rear;
    int size;
    int[] arrr=new int[10];
    public void enqueue(int data) {
        arrr[0]=data;
        rear++;

    }
    public void dequeue(int data) {
        if(rear==0) {
            System.out.println("Queue is empty");
            return;
        }
        arrr[front]=0;
        front++;
    }
    public void display() {
        for(int i=front;i<=rear;i++) {
            System.out.print(arrr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        queue q=new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();    }



}
