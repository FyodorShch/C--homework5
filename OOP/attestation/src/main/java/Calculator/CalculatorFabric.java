package Calculator;

public class CalculatorFabric implements ICalculatorFabric{

    @Override
    public Calculator create(double primaryArgRealPart, double primaryArgImPart) {
        return new ComplexCalculator(primaryArgRealPart, primaryArgImPart);
    }
}
