public class Node {
    Node prev;
    Node next;
    int value;
    public Node(int value) {
        this.value = value;
    }
    public Node(Node prev, int value) {
        this.prev = prev;
        this.value = value;
    }
    public static void main(String[] args) {
        Node n = new Node(10);
        n.next = new Node(n, 20);
        n.next.prev.prev = new Node(n.next, 30);
        n.prev.next = n;
        Node temp = n.prev;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
