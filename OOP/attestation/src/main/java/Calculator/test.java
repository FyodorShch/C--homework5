package Calculator;

public class test {
    public static void main(String[] args) {
        ICalculatorFabric calculatorFabric = new CalculatorFabric();
        ViewCalculator view = new ViewCalculator(calculatorFabric);
        view.run();
    }
}
