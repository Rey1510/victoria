public class Calculator {
    int a;
    int b;

    public int getSum(int a, int b){
        return a + b;
    }

    public int getSubstract(int a, int b){
        return a-b;
    }

    public double getMultiply(int a, int b){
        return a*b;
    }

    public double getDivide(double a, double b){
        if(b==0){
            System.out.println("Pembagi tidak boleh 0");
            return 0;
        }
        return a/b;
    }

}
