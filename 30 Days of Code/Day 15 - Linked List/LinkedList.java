    public static  Node insert(Node head,int data) {
        if(head == null){
           return new Node(data);
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next; 
                //if(temp.next == null)
            }
            temp.next = new Node(data);
            return head;
        }
    }        
    
