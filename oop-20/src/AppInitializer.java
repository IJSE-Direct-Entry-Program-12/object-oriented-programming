public class AppInitializer {
    static{
        System.out.println("AppInitializer Static");
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.size());
        queue.dequeue();
        queue.print();
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        System.gc();
        System.out.println(queue.size());
        queue.print();
    }
}

class Queue{
    Node head;
    Node tail;
    int size;
    static{
        System.out.println("Queue Static");
    }
    {
        System.out.println("Queue Instance");
    }
    void enqueue(int value){
        System.out.println("About to enqueue");
        tail = (tail == null) ? new Node(value, null, null):
                (tail.previous = new Node(value, null, tail));
        if (size++ == 0) head = tail;
    }
    void dequeue(){
        if (head == null) return;
        head = head.previous;
        if (head == null) tail = null;
        else head.next = null;
        size--;
    }
    void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "-> ");
            temp = temp.previous;
        }
        System.out.println();
    }
    int size(){
        return size;
    }
}

class Node{
    int value;
    Node previous;
    Node next;
    static{
        System.out.println("Node Static");
    }
    {
        System.out.println("Node Instance");
    }
    public void finalize(){
        System.out.println("Aragana yaanawoo::" + this.value);
    }
    public Node(int value, Node previous, Node next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
        System.out.println("Node Constructor");
    }
}
