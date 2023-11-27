import java.util.*;
class Node{
    Node next;
    int data;
    Node(int b){
        data=b;
    }
}
class LinkedList
{
    static Node head=null;
    static Node curr=null;
public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<=4;i++)
    {
        System.out.println("Enter the value to add to list");
        int c=sc.nextInt();
        createList(c);
    }
    printList();
  }

  public static void createList(int a)
  {
        Node y=new Node(a);
        if(head==null)
        {
            head=y;
        }
        if(curr==null){
            curr=y;
        }
        else
        {
        curr.next=y;
        curr=y;
        }
  }

   public static void printList()
   {
        Node ab=head;
        if(head==null)
        {
        System.out.println("Nothing to print");
        return;
        }
        while(ab!=null){
            System.out.println(ab.data);
            ab=ab.next;
        }
   }
}