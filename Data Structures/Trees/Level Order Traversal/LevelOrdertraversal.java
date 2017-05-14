   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
   {
       Queue<Node> qu = new LinkedList<>();
       if(root!=null){
           qu.add(root);
       }
       while(! qu.isEmpty()){
           Node n = qu.remove();
           System.out.print(n.data+" ");
           if(n.left!=null){
               qu.add(n.left);
           }
           if(n.right!=null){
               qu.add(n.right);
           }
       }
       
   }
