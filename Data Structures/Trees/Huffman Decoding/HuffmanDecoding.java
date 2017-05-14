/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
        char[] c = S.toCharArray();
        Node curr = root;
    for(int i=0;i<c.length;i++){
        curr = c[i] == '0' ? curr.left : curr.right;
           if( curr.left == null && curr.right == null){
                System.out.print(curr.data);
                curr = root;
            }
        }
    }
      
