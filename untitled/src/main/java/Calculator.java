import java.lang.reflect.Array;

public class Calculator {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double divide(double a, double b) {
        if(b==0){
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a/b;
    }

    public static double multiplication(double a, double b) {
        return a*b;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }

}

