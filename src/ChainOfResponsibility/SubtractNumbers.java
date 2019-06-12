package ChainOfResponsibility;

public class SubtractNumbers implements Chain{

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "subtract") {
            System.out.println(request.getNum1() + " - " + request.getNum2() + " = " +
                    (request.getNum1()-request.getNum2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
