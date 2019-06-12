package Factory;

public class Add implements Calculate {

    @Override
    public void calculate(double num1, double num2) {
        System.out.println("num1+num2 is " + (num1+num2));
    }
}
