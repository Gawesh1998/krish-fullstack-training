package LinkedList;

class ReverseLinkedlist{

    static Node head;

    static class Node{

        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    Node reverse(Node node){
        Node pre=null;
        Node current=node;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        node=pre;
        return node;
    }

    void printList(Node node){
        while(node!= null){
            System.out.print(node.data+"\t");
            node = node.next;
        }
    }

    public static void main(String[]args){

        ReverseLinkedlist list = new ReverseLinkedlist();

        list.head = new Node(1);
        list.head.next = new Node(4);
        list.head.next.next = new Node(7);
        list.head.next.next.next = new Node(10);
        list.head.next.next.next.next = new Node(13);
        list.head.next.next.next.next.next = new Node(16);
        list.head.next.next.next.next.next.next = new Node(19);
        list.head.next.next.next.next.next.next.next = new Node(22);
        list.head.next.next.next.next.next.next.next.next = new Node(25);
        list.head.next.next.next.next.next.next.next.next.next = new Node(28);

        System.out.println("Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("\n");
        System.out.println("Reverse");
        list.printList(head);
    }
}