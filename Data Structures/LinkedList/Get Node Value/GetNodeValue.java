/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
 Node slow = head;
    Node fast = head;
    Node curr = head;
    int length=0;
    for(int i=0;i<n;i++){
        fast = fast.next;
    }
    while(fast.next !=null){
        slow = slow.next;
        fast = fast.next;
        
    }
    return slow.data;
}
