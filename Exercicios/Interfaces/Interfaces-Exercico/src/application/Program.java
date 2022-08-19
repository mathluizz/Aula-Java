package application;

import model.entities.Contract;
import model.entities.Installments;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyy): ");
        sc.nextLine();
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Contract value: ");
        Double total = sc.nextDouble();
        System.out.print("Enter number of installments: ");
        int months = sc.nextInt();

        Contract contract = new Contract(number, total, start);
        ContractService instm = new ContractService(months, contract, new PaypalService());
        instm.processContract();

        System.out.println("Installments: ");
        for(Installments it : contract.getInstallments()){
            System.out.println(it.toString());
        }
        sc.close();
    }
}
