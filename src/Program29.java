public class Program29 {
    public static String twosComplement(String binary) {
        int n = binary.length();
        StringBuilder onesComp = new StringBuilder();
    
        // Flip bits
        for (char bit : binary.toCharArray()) {
            onesComp.append(bit == '0' ? '1' : '0');
        }
    
        // Add 1 to the flipped bits
        String flipped = onesComp.toString();
        StringBuilder result = new StringBuilder();
        boolean carry = true;
    
        for (int i = n - 1; i >= 0; i--) {
            char bit = flipped.charAt(i);
            if (carry) {
                if (bit == '1') {
                    result.append('0');
                } else {
                    result.append('1');
                    carry = false;
                }
            } else {
                result.append(bit);
            }
        }
    
        return result.reverse().toString();
    }
    
}
