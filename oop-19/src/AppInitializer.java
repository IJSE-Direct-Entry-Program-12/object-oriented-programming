public class AppInitializer {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.peek());
        s1.pop();
        s1.print();
        s2.push(s1.peek());
        s1.pop();
        s2.push(s1.peek());
        s2.push(50);
        s2.print();
    }
}

class Stack {
    Node head;
    void push(int value) {
        head = new Node(value, head);
    }
    int peek() {
        return head != null ? head.value : -1;
    }
    void pop() {
        if (head == null) return;
        head = head.previous;
    }
    void print() {
        Node temp = head;
        System.out.println("=====");
        do {
            System.out.printf("|%3d|\n", temp.value);
        } while ((temp = temp.previous) != null);
        System.out.println("=====");
    }
}

class Node {
    int value;
    Node previous;
    public Node(int value, Node previous) {
        this.value = value;
        this.previous = previous;
    }
}
