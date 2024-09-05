public class Main {

    public static double luas(float pi, int r){
        return pi*r*r;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age;
        age = 20;

        long salary;
        salary = 0;

        float price;
        price = 99.9f;

        char nilai;
        nilai = 'A';

        boolean status;
        status = true;

        String myName;
        myName = "Reyy";

//        System.out.println("Hello My Name is " +myName);
//        System.out.printf("I'm %d years old \n", age);
//        System.out.println("My salary is "+salary);
//        System.out.println("I sell tissue for: " +price +'$');
//        System.out.println("My grade is: " +nilai);
//        System.out.println("Am I straight: " +status);


        final float pi = 3.14f;
        int r;
        r = 10;
        double l1 = luas(pi,r);
        System.out.println("Luas adalah "+l1);

        r=15;
        double l2 = luas(pi,r);
        System.out.println("Luas adalah "+l2);
    }
}