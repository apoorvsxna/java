import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // take input
        System.out.println("Enter 5 numbers:");
        int data = sc.nextInt();
        Node head = new Node(data);
        Node temp = head;

        for (int i = 1; i < 5; i++) {
            data = sc.nextInt();
            temp.next = new Node(data);
            temp = temp.next;
        }
        sc.close();

        // reverse list
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null)
        {
            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // print reverse
        System.out.println("Reversed List- ");
        while(prev!=null)
        {
            System.out.print(prev.data+" ");
            prev = prev.next;
        }
    }
}
