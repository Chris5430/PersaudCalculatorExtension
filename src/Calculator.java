public class Calculator {

    public Calculator(){

    }

    public double add(double x, double y){
        return x + y;
    }

    public double subtract(double x, double y){
        return x - y;
    }

    public double multiply(double x, double y){
        return x * y;
    }

    public double divide(double x, double y){
        return x / y;
    }

    public double mod(double x, double y){
        return x % y;
    }

    public double power(double x, double y){
        return Math.pow(x, y);
    }
}
