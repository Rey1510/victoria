public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Bank account = new Bank();
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Current Balance: "+account.getBalance());
    }
}