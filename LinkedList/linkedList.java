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

    public void addIn(int index, int value) {
        if(index == 0){
            addFirst(value);
            return;
        }

        else if(index == size){
            addLast(value);
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){ //Yaha i=1 se start karenge kyuki temp already head pe hai
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLast(){
        if(size == 1){
            return deleteFirst();
        }

        Node secondLast = getNode(size-2);

        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAt(int index){
        if(index == 0){
            return deleteFirst();
        }

        else if(index == size-1){
            return deleteLast();
        }

        Node temp = getNode(index-1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node findNode(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node getNode(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
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