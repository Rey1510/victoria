public class Main {
    public static void main(String[] args) {
        Employee myEmployee1 = new Employee();
        myEmployee1.address = "Jalanin Aja Dulu";
        myEmployee1.age = 21;
        myEmployee1.name = "Rey";
        myEmployee1.npk = "68773";
        myEmployee1.salary = 100.5;

        myEmployee1.sayHello();

        System.out.println("Hello " + myEmployee1.name+" " + "Age : " + myEmployee1.age +" " +myEmployee1.npk+" "+ myEmployee1.salary+" " + myEmployee1.address);

        Employee myEmployee2 = new Employee();
        myEmployee2.address = "Jalan Serta Yesus";
        myEmployee2.age = 60;
        myEmployee2.name = "Agus";
        myEmployee2.npk = "66666";
        myEmployee2.salary = 90010.52;

        myEmployee2.sayHello();

        System.out.println("Hello " + myEmployee2.name+" " + "Age : " + myEmployee2.age +" " +myEmployee2.npk+" "+ myEmployee2.salary+" " + myEmployee2.address);

    }
}