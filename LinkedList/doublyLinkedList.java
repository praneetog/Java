public class doublyLinkedList {
    
    Node head;
    int size = 0;

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertInBetween(int value, int index){
        if(index == 0){
            insertFirst(value);
        }

        if(index == size){
            insertLast(value);
        }

        Node temp = head;
        for(int i=0; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next, temp.prev);
        temp.next = node;

        size++;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Reverse traversal");
        while(last != null){
            System.out.print(last.value + " --> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    static class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.display();
    }
}
