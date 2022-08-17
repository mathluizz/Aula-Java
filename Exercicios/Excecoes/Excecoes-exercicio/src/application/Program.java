package application;

import model.entities.Account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double wdLimit = sc.nextDouble();

            Account ac = new Account(number, holder, initBalance, wdLimit);

            System.out.println("Enter amount for withdraw: ");
            ac.withdraw(sc.nextDouble());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       } catch (InputMismatchException e) {
            System.out.println("ERROR: Just numbers on this field");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");;
        }

        sc.close();
    }
}
