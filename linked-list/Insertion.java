import java.util.*;
public class Insertion
{
    private static class Node 
    {
        int value;
        Node next;

        Node(int data)
        {
            this.value = data;
        }
    }
    public static void main(String[] args) 
    {
        Node head = new Node(6);
        Node dup = head;

        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5; i++)
        {
            Node n = new Node(sc.nextInt());
            head.next = n;
            head = head.next;
        }
        do
        {
            System.out.print(dup.value+", ");
            dup = dup.next;
        }
        while(dup != null);
        sc.close();
    }
}