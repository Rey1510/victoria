public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int a  = 1000291;
        int b = 1219;

        Calculator calc = new Calculator();

        System.out.println("Sum is "+ calc.getSum(a,b));
        System.out.println("Min is "+ calc.getSubstract(a,b));
        System.out.println("Multiply is "+ calc.getMultiply(a,b));
        System.out.println("Divide is "+ calc.getDivide(a,b));
    }
}