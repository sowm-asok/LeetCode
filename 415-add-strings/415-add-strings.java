class Solution {
    public String addStrings(String num1, String num2) {
        int placeSum = 0;
        int carry = 0;
        int length = num1.length() - num2.length();
        String sum ="";
        if(length < 0){
            num1 = String.format("%1$" + num2.length() + "s", num1).replace(' ', '0');
        }
        else if(length > 0) {
            num2 = String.format("%1$" + num1.length() + "s", num2).replace(' ', '0');
        }
        for (int i = num1.length()-1; i >= 0; i--) {
            if (carry == 1) {
                placeSum = carry + (num1.charAt(i) - '0') + (num2.charAt(i)-'0');
                carry--;
            } else {
                placeSum = (num1.charAt(i) - '0') + (num2.charAt(i)-'0');
            }
            if (placeSum > 9) {
                carry++;
                placeSum = placeSum%10;
            }
            sum =placeSum + sum;
        }
        return carry == 1? carry+sum : sum;
    }
}