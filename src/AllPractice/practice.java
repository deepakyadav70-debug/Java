package AllPractice;
import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class practice {
    public static void insertAtHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        temp = head;
    }
    public static void show(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void main() {
        Node first = new Node(10);
        Node second = new Node(90);
        Node third = new Node(23);
        Node fourth = new Node(25);
        first.next = second;
        second.next = third;
        third.next = fourth;

        show(first);

       insertAtHead(first, 56);

       show(first);
    }
}
