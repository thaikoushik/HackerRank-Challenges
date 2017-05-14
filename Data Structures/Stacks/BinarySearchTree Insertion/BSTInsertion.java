/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value){
    Node n = new Node();
    n.data = value;
    
    if(root == null){
        //n.left = null;
        //n.right = null;
        return n;
    }else{
        if(value < root.data ){
            if(root.left == null){
                root.left = n;
                return root;
            }else{
                Insert(root.left,value);
            }
        }else{
            if(root.right == null){
                root.right = n;
                return root;
            }else{
                Insert(root.right,value);
            }
        }
    return root;
    }
        

       
    }
