package Calculator;

import java.util.Scanner;
public class ViewCalculator {
    private ICalculatorFabric calculatorFabric;

    public ViewCalculator(ICalculatorFabric calculatorFabric) {
        this.calculatorFabric = calculatorFabric;
    }

    public void run() {
        while (true) {
            double primArgRealPart = promptDouble("Введите реальную часть числа: ");
            double primArgImaginaryPart = promptDouble("Введите мнимую часть числа: ");
            Calculator calculator = calculatorFabric.create(primArgRealPart, primArgImaginaryPart);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =): ");
                if (cmd.equals("+")) {
                    double realPartArg = promptDouble("Введите реальную часть второго числа: ");
                    double imaginaryPartArg = promptDouble("Введите мнимую часть второго числа: ");
                    calculator.sum(realPartArg, imaginaryPartArg);
                    continue;
                }
                if (cmd.equals("*")) {
                    double realPartArg = promptDouble("Введите реальную часть второго числа: ");
                    double imaginaryPartArg = promptDouble("Введите мнимую часть второго числа: ");
                    calculator.multiply(realPartArg, imaginaryPartArg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double realPartArg = promptDouble("Введите реальную часть второго числа: ");
                    double imaginaryPartArg = promptDouble("Введите мнимую часть второго числа: ");
                    calculator.divide(realPartArg, imaginaryPartArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.println(result);
                    break;
                }
            }
            String cmd = prompt("Продолжать выисления? (Y, N)");
            if (cmd.equals("Y".toLowerCase())){
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return Double.parseDouble(in.nextLine());
    }
}