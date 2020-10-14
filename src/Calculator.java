public class Calculator {
    public double a, b;

    static void addition(double a, double b) {
        System.out.println("Sum a + b= " + (a + b));
    }

    static void substraction(double a, double b) {
        System.out.println("Difference a - b =" + (a - b));
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(12.34, 45.67);
        calculator.substraction(98.76, 45.67);
    }
}

