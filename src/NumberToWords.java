public class NumberToWords {

    public static void numberToWords(int number) {

        int reversedNumber = reverse(number);
//        System.out.println("Reversed Number = " + reversedNumber);
        int digitCount = getDigitCount(reversedNumber);
//        System.out.println("Digit count reversed number = " + digitCount);
        int digitCountOriginalNumber = getDigitCount(number);
//        System.out.println("Digit count Original number = " + digitCountOriginalNumber);

        int lastDigit;

        if (reversedNumber >= 0) {
            while (reversedNumber > 0) {
                lastDigit = reversedNumber % 10;
//                System.out.println("Last digit is: " + lastDigit);
                reversedNumber /= 10;

                if (lastDigit==0) {
                    System.out.println("Zero");
                } else if (lastDigit==1) {
                    System.out.println("One");
                } else if (lastDigit==2) {
                    System.out.println("Two");
                } else if (lastDigit==3) {
                    System.out.println("Three");
                } else if (lastDigit==4) {
                    System.out.println("Four");
                } else if (lastDigit==5) {
                    System.out.println("Five");
                } else if (lastDigit==6) {
                    System.out.println("Six");
                } else if (lastDigit==7) {
                    System.out.println("Seven");
                } else if (lastDigit==8) {
                    System.out.println("Eight");
                } else if (lastDigit==9) {
                    System.out.println("Nine");
                }

            }  for (int i = digitCount + 1; i <= digitCountOriginalNumber; i++) {

//            System.out.println("The value of I =" + i);
//                lastDigit = i;
                System.out.println("Zero");
//            lastDigit=0;
//            System.out.println("last digit value = " + lastDigit);
            }
                    if (number==0) {
            System.out.println("Zero");
        }
//            System.out.println("Number is Valid");
        }
        else System.out.println("Invalid Value");
    }

    public static int reverse(int inverseNumber) {

        int reversedNumber = 0;

        while (inverseNumber != 0) {
            int lastDigit = inverseNumber % 10;
//            System.out.println("last digit " + lastDigit);
            reversedNumber = (reversedNumber * 10) + lastDigit;
            inverseNumber /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {

        int digitCount = 0;

        if (number >= 0) {
            do {
                int lastDigit = number % 10;
//                System.out.println("Last digit = " + lastDigit);
                digitCount++;
//                System.out.println("Digit Count = " + digitCount);
                number /= 10;
            } while (number > 0);
            return digitCount;
        } else return -1;
    }
}




