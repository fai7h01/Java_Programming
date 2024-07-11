package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Luka",1324344543);

        System.out.println(obj1);

        obj1.deposit(1500);
        obj1.checkBalance();

        obj1.withdraw(650);
        obj1.checkBalance();

        obj1.withdraw(6000);
        obj1.checkBalance();

        obj1.deposit(10000);
        obj1.checkBalance();

        System.out.println("----------------------------------------------");

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount();

        account1.setInfo("Sebastian",1764554413);
        account2.setInfo("Nolan",586586548);

        account1.deposit(5000);
        account2.deposit(10000);

        System.out.println(account1);
        System.out.println(account2);

        account1.withdraw(3200);
        account2.withdraw(7000);

        System.out.println(account1);
        System.out.println(account2);







    }
}
