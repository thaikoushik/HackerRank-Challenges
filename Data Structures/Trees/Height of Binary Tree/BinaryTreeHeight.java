	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        if(root == null){
            return -1;
        }else{
            return 1+Math.max(height(root.left),height(root.right));
        }
        
        
    }
