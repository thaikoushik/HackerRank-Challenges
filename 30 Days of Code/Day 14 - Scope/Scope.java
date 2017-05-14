	// Add your code here
    Difference(int[] arr){
        this.elements = arr;
    }
    
   public void computeDifference(){
        int sum = 0;
        //maximumDifference = 0;
        int min = elements[0]; int max = elements[0];
        for(int i=0;i<elements.length;i++){
            if(elements[i] < min){
                min = elements[i];
            }
        }
       for(int i=0;i<elements.length;i++){
           if(elements[i]>max){
               max = elements[i];
           }
       }
       maximumDifference = Math.abs(max - min);
        
    }
    
