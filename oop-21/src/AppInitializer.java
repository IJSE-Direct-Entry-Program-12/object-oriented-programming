public class AppInitializer {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        list.add(2,25);
    }
}
class LinkedList{
    int size;
    Node head;
    Node tail;
    void add(int index, int value){
        if (index >= size || index < 0) return;
        if (index == 0){
            head = new Node(value, head);
            if (tail == null) tail = head;
        }else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node(value, temp.next);
        }
        size++;
    }

    void add(int value){
        Node newNode = new Node(value, null);
        if (head == null){
            head = tail = newNode;
        }else{
            tail = tail.next = newNode;
        }
        size++;
    }

    void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    int size(){
        return size;
    }

    public void remove(int index){

    }
}
class Node{
    int value;
    Node next;
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
