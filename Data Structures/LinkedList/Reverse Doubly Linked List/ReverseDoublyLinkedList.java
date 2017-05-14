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

Node Reverse(Node head) {
    if(head==null){
        return head;
    }
    if(head.next == null){
        return head;
    }
    Node curr = head;
    Node previ = null;
    Node nex = null;
    while(curr!=null){
        nex = curr.next;
        curr.next = previ;
        previ = curr;
        curr = nex;
        }
    return previ;

