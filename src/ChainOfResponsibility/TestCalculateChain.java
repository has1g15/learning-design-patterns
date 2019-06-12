package ChainOfResponsibility;

public class TestCalculateChain {

    public static void main(String[] args) {

        Chain chainCalculate1 = new AddNumbers();
        Chain chainCalculate2 = new SubtractNumbers();
        Chain chainCalculate3 = new MultiplyNumbers();
        Chain chainCalculate4 = new DivideNumbers();

        chainCalculate1.setNextChain(chainCalculate2);
        chainCalculate2.setNextChain(chainCalculate3);
        chainCalculate3.setNextChain(chainCalculate4);

        Numbers request = new Numbers(4, 2, "multiply");
        chainCalculate1.calculate(request);
    }
}
