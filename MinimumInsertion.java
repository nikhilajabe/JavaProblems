class MinimumInsertion {
    static int minInsertion(String s) {
        int right = 0, res = 0;   // represents the number of right parentheses needed. & number of left/right parentheses already added.
        for (int i = 0; i < s.length(); i++) {    //iteration over givern string of unbalanced paranthesis
            if (s.charAt(i) == '(') {    
                if (right % 2 != 0) {   // condition to check balance of parentheses,if odd, it means there is an unmatched closing parentheses
                    right--;
                    res++;
                }
                right += 2;
            } else {    //balancing the umtached parantheses
                right--;
                if (right < 0) { 
                    right += 2;
                    res++;
                }
            }
        }
        return res + right;
    }
}
