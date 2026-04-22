import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        double balance = 100000.00;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.println(name + " Welcome to Unison Bank");
        System.out.println(name + " Current Balance: $" + balance);

        System.out.println("Enter amount to deposit: ");
        double deposit = scanner.nextDouble();

        balance += deposit;

        System.out.println("Deposit Successful!");
        System.out.println(name + "\nNew Balance: $" + balance);
        System.out.println("-------------------------------------");

        scanner.close();
    }
}