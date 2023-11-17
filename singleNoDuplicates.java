class Solution {
    public int singleNonDuplicate(int[] nums) {
          if (nums.length==1){
            return nums[0];  // return element for single element in array
        }
        for (int i=0,j=1;i<nums.length-1;i++,j++){  //iteration over array for checking condition of no duplicate element
            if (nums[i]!=nums[j]){   //compare element with other element
                return nums[i];    //return element if condition are true
            }
            else {
                i++;  
                j++;
            }

        }
        return nums[nums.length-1]; //if no single element found after iteration then it must be a last element
    }
}
