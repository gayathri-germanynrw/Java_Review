package week04_review;

public class CustomMethods {
    public static void main(String[] args) {
       int sum= calculate(10,'-',5);
       double sumValue= calculate(10.0,'-',5.0);


        System.out.println("sum = " + sum);
        System.out.println("sumValue = " + sumValue);

    }
    public static int calculate(int num1,char operator,int num2) {
        int result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
       return result;

    }

    public static double calculate(double firstNumber,char operator,double secondNumber) {
        double resultDouble = 0;
        switch (operator) {
            case '+' -> resultDouble = firstNumber + secondNumber;
            case '-' -> resultDouble = firstNumber - secondNumber;
            case '*' -> resultDouble = firstNumber * secondNumber;
            case '/' -> resultDouble = firstNumber / secondNumber;
        }
        return resultDouble;

    }
}
