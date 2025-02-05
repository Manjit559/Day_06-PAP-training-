import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int new_data){
        data = new_data;
        next = null;
    }
}

class Main {
    
    public static Node insertAtFront(Node head,int new_data){
        Node new_node = new Node(new_data);
        
        if(head==null){
        return new_node;
        }
        
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        
        curr.next = new_node;
        return head;
        
    }
    
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(" "+curr.data);
            curr = curr.next;
        }
    }
    
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.print("Enter the number of nodes in the list: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertAtFront(head, data);  
        }

        System.out.print("The linked list is:");
        printList(head);
        
        sc.close();
        }
    }
