public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.model = "Toyota";
//        myCar.year = 2020;
//        myCar.drive();
        Motor myMotor1 = new Motor("CBR", 2023);
        Motor myMotor2 = new Motor("PCX", 2018);
        Sepeda sepeda1 = new Sepeda();
        Sepeda sepeda2 = new Sepeda();

        System.out.println("Motor 1: " + myMotor1.model + " " + "Tahun " + myMotor1.year);
        System.out.println("Motor 2: " + myMotor2.model + " " + "Tahun " + myMotor2.year);

        System.out.println("Sepeda 1: " + sepeda1.model + " " + "Tahun " + sepeda1.year);
        System.out.println("Sepeda 2: " + sepeda2.model + " " + "Tahun " + sepeda2.year);
    }
}