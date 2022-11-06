package learnLinkedList;

public class LearnLinkedList {
    Node head;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;

        }

    }
    public void addFirst(String data){
        Node node = new Node(data);
        if(head==null){
           head=node;
        }
        else{
            node.next=head;
            head=node;
        }

    }
    public void addLast(String data){
        Node node = new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node currentNode=head;
            while(currentNode.next!=null){

                currentNode=currentNode.next;
            }
            currentNode.next=node;
            node.next=null;
        }

    }
    public void deleteFirst(){
        head=head.next;
    }
    public void deleteLast(){

        Node currentNode=head;
        while(currentNode.next.next!=null){

            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }

    public void reverseList(){
        Node prevNode=head;
        Node currentNode=head.next;
        Node nextNode=head.next.next;

        while(currentNode.next!=null){

            currentNode.next=prevNode;
            prevNode=currentNode;
            currentNode=nextNode;
            nextNode=currentNode.next;

        }
        currentNode.next=prevNode;
        head.next=null;
        head=currentNode;

    }

    public void printList(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data + "-> ");
            currentNode=currentNode.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        LearnLinkedList ll = new LearnLinkedList();

        ll.addFirst("Rafi");
        ll.addFirst("Arefin");
        ll.addFirst("Ishraque");
        ll.addLast("Welcome");
        ll.reverseList();
//        ll.deleteFirst();
//       ll.deleteLast();
        ll.printList();

    }
}
