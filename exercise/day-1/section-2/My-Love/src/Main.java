public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        BankAccount ba = new BankAccount("12345678");
        ba.deposit(1000000);
        System.out.println("Saldo anda(Deposit pertama) : " +ba.getBalance());
        ba.withdraw((60000));
        System.out.println("Saldo anda(After withdraw) : "+ba.getBalance());
        ba.setAccountHolder("Reyyy");
        System.out.println("Account Holder: "+ba.getAccountHolder());

    }
}