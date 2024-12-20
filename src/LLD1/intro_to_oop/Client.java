package LLD1.intro_to_oop;

public class Client {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "Nandkishor Akangire";
//        s1.age = 27;
//        s1.course = "Bachelor of Computer Science";
//        s1.gradYear = 2021;
//        s1.printDetails();
        BankAccount b1 = new BankAccount();
        b1.checkBalance();
        b1.deposite(1000);
        b1.checkBalance();
        b1.withdraw(100);
        b1.checkBalance();
    }
}
