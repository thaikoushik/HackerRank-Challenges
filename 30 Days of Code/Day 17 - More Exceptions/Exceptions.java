//Write your code here

class Calculator{
    public int power(int n,int p) throws Exception{
        int ans=1;
        if(n>=0 && p>=0){
            for(int i=0;i<p;i++){
                ans *= n;
            }
        }else
            throw new Exception("n and p should be non-negative");
        return ans;
    }
}
