	static void levelOrder(Node root){
      //Write your code here
      Queue<Node> qye = new LinkedList<Node>();
      if(root!=null){
          qye.add(root);
      }
        while(!(qye.isEmpty())){
            Node a = qye.remove();
            System.out.print(a.data+" ");
            if(a.left != null){
                qye.add(a.left);
            }
            if(a.right!= null){
                qye.add(a.right);
            }
            
        }
    }
