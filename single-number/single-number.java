class Solution {
    public int singleNumber(int[] nums) {
        
        // xor is associative and commutative                                         
        // xor of number itself is 0 
        // zero XOR non-zero is non-zero number itself
        // [4,1,2,1,2] => 0^4^(1^1)^(2^2) => 0^4^0^0 => 4  
        
        int element = 0;
        for(int number : nums) {
            element = element ^ number;
            System.out.println(element);
        }
        return element;
    }
}