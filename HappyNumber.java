  class HappyNumber{
    public static int happyNum(int num){
    int r,sum=0; //variable declaration
    while (num>0){
        r=num%10;
        sum=sum+(r*r);  //sum of square of individual digit of number
        num=num/10;
    }
        return sum;  //return sum
    }

    public static boolean isHappy(int temp){
        while(temp!=1&&temp!=4){  //condition to check the happy number
            temp=happyNum(temp);
        }
        return temp==1;  // //Happy number always ends with 1
    }
    public static void main(String[] args) {
        System.out.println(isHappy(13));  //true
        System.out.println(isHappy(19));  //true
        System.out.println(isHappy(15));  //false
        System.out.println(isHappy(20));  //false
        System.out.println(isHappy(23));  //true
    }
}
