import java.util.Arrays;
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }
    public static void main(String args[]){
        Solution Sol = new Solution();
        int[] digits1 = {1,2,3};
        int[] digits2 = {4,3,2,1};
        int[] digits3 = {9,9,9};

        System.out.println(Arrays.toString(Sol.plusOne(digits1))); 
        System.out.println(Arrays.toString(Sol.plusOne(digits2))); 
        System.out.println(Arrays.toString(Sol.plusOne(digits3)));
        
    }
}