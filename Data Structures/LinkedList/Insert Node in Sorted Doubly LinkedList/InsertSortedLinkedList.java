/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    Node n = new Node();
    n.data = data;
        
    if(head == null){
       
        return n;
    }
    else if(data<head.data){
        n.next = head;
        head.prev = n;
        return n;
    }
    else{
        Node curr = head;
        Node n1 = null;
        while(curr != null && curr.data<data){
                n1 = curr;
                curr = curr.next;
        }
        
        if(curr == null){
                n1.next = n;
                n.prev = n1;
           // System.out.println(n1.data);
            }else{
                n1.next = n;
                curr.prev = n;
                n.next = curr;
                n.prev = n1;
                //return head;
            }return head;
        }
    }
