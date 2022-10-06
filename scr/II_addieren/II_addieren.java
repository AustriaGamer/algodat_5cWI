package II_addieren;

import java.util.Scanner;

public class II_addieren {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your number: ");
            String number1 = scanner.nextLine();
            System.out.println("Please enter a number: ");
            String number2 = scanner.nextLine();

            if (number1.length() - number2.length() != 0) {
                int difference = number1.length() - number2.length();
                if (difference < 0) {
                    for (int i = difference; i < 0; i++) {
                        number1 = "0" + number1;
                    }
                } else {
                    for (int i = 0; i < difference; i++) {
                        number2 = "0" + number2;
                    }
                }
            }
            
            int nextInteger=0;
            String result = "";
            for (int i = number1.length() - 1; i >= 0; i--) {
                int sum = Integer.parseInt(number1.substring(i, i + 1)) + Integer.parseInt(number2.substring(i, i + 1)) + nextInteger;
                nextInteger = 0;
                if (sum >= 10) {
                    nextInteger = 1;
                    sum -= 10;
                }
                result = String.valueOf(sum) + result;
            }
            System.out.println(number1 + " + " + number2 +" = "+ result);
        }
    }
}
