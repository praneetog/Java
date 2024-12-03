public class linkedList {

    private Node head;
    private Node tail;

    private int size;

    public linkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            addFirst(value);
            return;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void display(){
        Node temp = head; //temp isliye lete hai taki head kbhi null na ho
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display();
    }
} 

//33:51