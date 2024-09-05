public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        BankAccount ba = new BankAccount("12345678","Reyyy");
        ba.deposit(1000000);
        System.out.println("Saldo anda : " +ba.getBalance());
        ba.withdraw((60000));
        System.out.println("Saldo anda : "+ba.getBalance());
        System.out.println("Account Holder: "+ba.getAccountHolder());
        ba.setAccountHolder("Reiii");
        System.out.println("Account Holder: "+ba.getAccountHolder());

    }
}