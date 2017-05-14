class Student extends Person{
	private int[] testScores;
  public Student(String first, String last, int id, int[] scores){
        super(first,last,id);           
        testScores = scores;
    }
    
    public char calculate(){
        double average = 0;
        int sum =0;
        //char abc = calcuateGrades(scores);
        //System.out.println("Name: "+first+", "+last);
        //System.out.println("Id: "+id);
        for(int i=0;i<testScores.length;i++){
            sum += testScores[i];
        }
        average = sum/testScores.length;
        
        if(average>=90 && average<=100){
            return 'O';
        // System.out.println("Grade: O");
        
        }
        else if(average>=80 && average<90){
            return 'E';
            //System.out.println("Grade: E");
        
        }
        else if(average>=70 && average<80){
            return 'A';
            //System.out.println("Grade: A");
        
        }
        else if(average>=55 && average<70){
        return 'P';
        //    System.out.println("Grade: P");
        
        }
        else if(average>=40 && average<55){
        //    System.out.println("Grade: D");
        return 'D';
        }
        else
            return 'T';
          //  System.out.println("Grade: T");
        
    }

   
    
}
