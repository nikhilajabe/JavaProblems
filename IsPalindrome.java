class IsPalindrome{
    public static boolean isPalindrome(int num){
    int r,sum=0; //variable declaration
    int  temp; //variable declaration
    temp=num;  //storing original number
    while (num>0){
        r=num%10;
        sum=r+(sum*10);
        num=num/10;  //reversing original number
    }
        return temp==sum; //comparing reverse and original number
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1215674));
        System.out.println(isPalindrome(78987));
        System.out.println(isPalindrome(12321));

    }
}
