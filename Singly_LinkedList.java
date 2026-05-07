public class Singly_LinkedList {

    static class Node {
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next =null;
        }

    }
    Node head;
    public void insertAtStart(int data){
        Node n1 = new Node(data);
        n1.next = head;
        head = n1;
    }
    public void insertAtEnd(int data){
        Node n2 = new Node(data);
        if(head ==null){
            head = n2;
            return;
        }
        Node travel = head;
        while (travel.next != null) {
            travel = travel.next;
        }
        travel.next = n2;
    }
    public void display(){
        Node apple = head;
        while (apple != null) {
            System.out.print(apple.data + " ->");
            apple = apple.next; 
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Singly_LinkedList s1 = new Singly_LinkedList();
        s1.insertAtEnd(185);
        s1.insertAtStart(85);
        s1.insertAtStart(2);
        // s1.deleteFromStart();
        // s1.deleteFromEnd();
        s1.display();
        
    }

    public void deleteFromStart(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head= head.next;
    }

    public void deleteFromEnd(){
          if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node trv = head;
        while (trv.next.next != null) {
            trv = trv.next;   
        }
        trv.next = null;
    }

}