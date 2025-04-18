
// Interface for Binary Operations
interface BinaryOperations {
    int binaryToDecimal(String binary);
    String decimalToBinary(int decimal);
    String twosComplement(String binary);
    String addBinary(String b1, String b2);
}

// Class implementing the BinaryOperations interface
class BinaryCalculator implements BinaryOperations {

    @Override
    public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    @Override
    public String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    @Override
    public String twosComplement(String binary) {
        // Find 1's complement
        StringBuilder ones = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            ones.append(bit == '0' ? '1' : '0');
        }

        // Add 1 to 1's complement
        StringBuilder twos = new StringBuilder();
        boolean carry = true;

        for (int i = ones.length() - 1; i >= 0; i--) {
            char bit = ones.charAt(i);
            if (bit == '1' && carry) {
                twos.insert(0, '0');
            } else if (bit == '0' && carry) {
                twos.insert(0, '1');
                carry = false;
            } else {
                twos.insert(0, bit);
            }
        }

        // If overflow, add 1 at the front
        if (carry) {
            twos.insert(0, '1');
        }

        return twos.toString();
    }

    @Override
    public String addBinary(String b1, String b2) {
        int maxLength = Math.max(b1.length(), b2.length());
        b1 = String.format("%" + maxLength + "s", b1).replace(' ', '0');
        b2 = String.format("%" + maxLength + "s", b2).replace(' ', '0');

        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            int bit1 = b1.charAt(i) - '0';
            int bit2 = b2.charAt(i) - '0';

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            result.insert(0, '1');
        }

        return result.toString();
    }
}

// Main Class to Test the Operations
public class Program37 {
    public static void main(String[] args) {
        BinaryCalculator calc = new BinaryCalculator();

        String binary1 = "1101";  // 13
        String binary2 = "1011";  // 11

        System.out.println("Binary to Decimal:");
        System.out.println(binary1 + " = " + calc.binaryToDecimal(binary1));

        System.out.println("\nDecimal to Binary:");
        System.out.println("25 = " + calc.decimalToBinary(25));

        System.out.println("\nTwo's Complement of " + binary1 + " = " + calc.twosComplement(binary1));

        System.out.println("\nBinary Addition:");
        System.out.println(binary1 + " + " + binary2 + " = " + calc.addBinary(binary1, binary2));
    }
}
