package ChainOfResponsibility;

public class DivideNumbers implements Chain{

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "divide") {
            System.out.println(request.getNum1() + " / " + request.getNum2() + " = " +
                    (request.getNum1()/request.getNum2()));
        } else {
            System.out.println("Only works for add, subtract, multiply and divide");
        }
    }
}
