    public static Node removeDuplicates(Node head) {
        Node curr = head;
      //Write your code here
        if(head == null){
            return head;
        }
        
        while(curr != null && curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else
            curr = curr.next;
        }
        return head;
    }
