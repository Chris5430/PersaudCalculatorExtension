import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = input.nextLine();
        if(expression.indexOf("+") != -1){
            double num1 = Double.parseDouble(expression.substring(0, expression.indexOf("+") - 1));
            double num2 = Double.parseDouble(expression.substring(expression.indexOf("+") + 1));
            System.out.println(calc.add(num1, num2));
        }
        if(expression.indexOf("-") != -1){
            double num1 = Double.parseDouble(expression.substring(0, expression.indexOf("-") - 1));
            double num2 = Double.parseDouble(expression.substring(expression.indexOf("-") + 1));
            System.out.println(calc.subtract(num1, num2));
        }
        if(expression.indexOf("*") != -1){
            double num1 = Double.parseDouble(expression.substring(0, expression.indexOf("*") - 1));
            double num2 = Double.parseDouble(expression.substring(expression.indexOf("*") + 1));
            System.out.println(calc.multiply(num1, num2));
        }
        if(expression.indexOf("/") != -1){
            double num1 = Double.parseDouble(expression.substring(0, expression.indexOf("/") - 1));
            double num2 = Double.parseDouble(expression.substring(expression.indexOf("/") + 1));
            System.out.println(calc.divide(num1, num2));
        }
        if(expression.indexOf("%") != -1){
            double num1 = Double.parseDouble(expression.substring(0, expression.indexOf("%") - 1));
            double num2 = Double.parseDouble(expression.substring(expression.indexOf("%") + 1));
            System.out.println(calc.mod(num1, num2));
        }
        if(expression.indexOf("^") != -1){
            double num1 = Double.parseDouble(expression.substring(0, expression.indexOf("^") - 1));
            double num2 = Double.parseDouble(expression.substring(expression.indexOf("^") + 1));
            System.out.println(calc.power(num1, num2));
        }
    }
}
