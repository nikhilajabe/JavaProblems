class VowelofallSubString {
    public boolean isVowel(char c){
      return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';  //check for character is vowel or not
    }

    public long countVowels(String word) {
        long count=0;
        for(int i=0;i<word.length();i++){              //iteration over String 
            if(isVowel(word.charAt(i))){
                count+=(long)(word.length()-i)*(long)(i+1);   //add count
            }
        }
return count;
    }
}
