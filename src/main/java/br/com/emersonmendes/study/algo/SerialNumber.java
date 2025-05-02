package br.com.emersonmendes.study.algo;

public class SerialNumber {

    public static boolean SerialNumber(String str) {

        String[] parts = str.split("\\.");

        if (parts.length != 3) {
            return false;
        }

        for (String part : parts) {
            if (part.length() != 3) {
                return false;
            }
        }

        int sumPart1 = 0;
        int sumPart2 = 0;

        for (char c : parts[0].toCharArray()) {
            sumPart1 += Character.getNumericValue(c);
        }
        for (char c : parts[1].toCharArray()){
            sumPart2 += Character.getNumericValue(c);
        }

        if (sumPart1 % 2 != 0 || sumPart2 % 2 != 1) {
            return false;
        }

        for (String part : parts) {
            int numA = Character.getNumericValue(part.charAt(0));
            int numB = Character.getNumericValue(part.charAt(1));
            int numC = Character.getNumericValue(part.charAt(2));
            if (numC <= numA || numC <= numB) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(SerialNumber("11.124.667"));  // false
        System.out.println(SerialNumber("114.568.112")); // true
        System.out.println(SerialNumber("224.315.218")); // true
    }

}
