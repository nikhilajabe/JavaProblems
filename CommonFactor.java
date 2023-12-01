class CommonFactor {
    public int commonFactors(int a, int b) {
        int min=Integer.min(a, b);  
        int count=0;
        for(int i=1;i<=min;i++){//iteration over minimum digit
            if(a%i==0&&b%i==0){  //condition to check if int i is a common factor for both digits if yes count is increase
                count++;   
            }
        }return count;  //return total of count 
    }
}
