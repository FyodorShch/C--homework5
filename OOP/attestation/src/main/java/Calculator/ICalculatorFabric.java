package Calculator;

public interface ICalculatorFabric {
    Calculator create(double primaryArgRealPart, double primaryArgImaginaryPart);
}
