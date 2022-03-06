package calc;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1); // b = 0
        int c = calc.devide.apply(a, b); // ArithmeticException / by zero

        calc.println.accept(c);
    }
}
