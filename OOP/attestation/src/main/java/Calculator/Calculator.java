package Calculator;

public interface Calculator {

    Calculator sum(double numRealPart, double numImaginPart);

    Calculator multiply(double numRealPart, double numImaginPart);

    Calculator divide(double numRealPart, double numImaginPart);
    String getResult();
}
