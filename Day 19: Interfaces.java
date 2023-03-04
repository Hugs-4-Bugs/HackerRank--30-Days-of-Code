
class Calculator implements AdvancedArithmetic {
    // private int n;
    public int divisorSum(int n) {
        // return 0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum +=i;
            }
        }
        return sum ;
        
    }
}

