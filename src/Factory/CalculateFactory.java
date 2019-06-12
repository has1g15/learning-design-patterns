package Factory;

public class CalculateFactory {

    public Calculate getCalculation(String type) {
        Calculate calculate = null;
        if(type.toLowerCase().equals("add")) {
            calculate = new Add();
        } else if (type.toLowerCase().equals("subtract")) {
            calculate = new Subtract();
        } else if (type.toLowerCase().equals("multiply")) {
            calculate = new Subtract();
        } else if (type.toLowerCase().equals("divide")) {
            calculate = new Subtract();
        }
        return calculate;
    }
}
