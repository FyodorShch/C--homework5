package Calculator;

public final class ComplexCalculator implements Calculator {
    private double primaryArgRealPart;
    private double primaryArgImPart;


    public ComplexCalculator(double primaryArgRealPart, double primaryArgImPart) {
        this.primaryArgRealPart = primaryArgRealPart;
        this.primaryArgImPart = primaryArgImPart;
    }

    @Override
    public Calculator sum(double numRealPart, double numImaginPart) {
        primaryArgRealPart = primaryArgRealPart + numRealPart;

        primaryArgImPart = primaryArgImPart + numImaginPart;
        ComplexNumber result = new ComplexNumber(primaryArgRealPart, primaryArgImPart);

        return this;

    }


    @Override

    public Calculator multiply(double numRealPart, double numImaginPart) {

        primaryArgRealPart = (primaryArgRealPart * numRealPart) -

                (primaryArgImPart * numImaginPart);
        primaryArgImPart = (primaryArgRealPart * numImaginPart) + (primaryArgImPart * numRealPart);

        ComplexNumber result = new ComplexNumber(primaryArgRealPart, primaryArgImPart);
        return this;
    }


    @Override

    public Calculator divide(double numRealPart, double numImaginPart) {

        double denominator = (numRealPart * primaryArgRealPart) +
                (numImaginPart * numImaginPart);

        primaryArgRealPart = ((primaryArgRealPart * numRealPart) +
                (primaryArgImPart * numImaginPart)) / denominator;

        primaryArgImPart = ((primaryArgImPart * numRealPart) -

                (primaryArgRealPart * numImaginPart)) / denominator;

        ComplexNumber result = new ComplexNumber(primaryArgRealPart, primaryArgImPart);
        return this;
    }

    @Override
    public String getResult() {
        return "Реальная часть комплексного числа: " + primaryArgRealPart + "мнимая часть комплексного числа" + primaryArgImPart + "i";
    }
}
