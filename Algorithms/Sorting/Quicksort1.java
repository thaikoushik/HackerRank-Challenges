import java.util.*;
public class Quicksort {
       
          static void partition(int[] ar) {
              int pivot = ar[0];
              int[] newar = new int[ar.length];
              int index = 0;
              swap(ar, 0, ar.length-1);
              for(int i=0;i<ar.length;i++){
                  if(ar[i]<pivot){
                     swap(ar,i,index);
                     // System.out.println(Arrays.toString(ar));
                      index++;
                  }
                  
              }
              swap(ar, index,ar.length-1);
             printArray(ar);
                    
       }   
    public static void swap(int ar[], int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
