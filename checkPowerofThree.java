    public boolean checkPowersOfThree(int n) {
        while (n > 1) {  //Iteration until n is non-zero
       int r = n % 3;
            if (r == 2) //Termination Condition
                return false;
            n /= 3;
        }
        return true;
    }
   

