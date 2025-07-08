  // Time: O(n), Space: O(1) 

//class Solution {
//    public int romanToInt(String s) {
//        Map<Character, Integer> roman = new HashMap<>();
//        roman.put('I', 1);
//        roman.put('V', 5);
//        roman.put('X', 10);
//        roman.put('L', 50);
//        roman.put('C', 100);
//        roman.put('D', 500);
//        roman.put('M', 1000);
//
//        int result = 0;
//        int prevValue = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int currentValue = roman.get(s.charAt(i));
//
//            if (currentValue < prevValue) {
//                result -= currentValue;
//            } else {
//                result += currentValue;
//            }
//
//            prevValue = currentValue;
//        }
//
//        return result;
//    }
//}


  // Time: O(n), Space: O(1) 

class Solution {
    public int romanToInt(String s) {
        int prevValue = 0;
        int result = 0;

        for (int i = s.length()-1 ; i >=0 ; i--) {
            int currentValue = romanCharToInt (s.charAt (i));

             if (currentValue < prevValue){
            result = result - currentValue;
            } else {
            result = result + currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}
