package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path:");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null){
                String [] field = line.split(",");
                list.add(new Employee(field[0],field[1], Double.parseDouble(field[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            List<String> email = list.stream()
                    .filter(x -> x.getSalary() > sal)
                    .map(Employee::getEmail)
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + sal);
            email.forEach(System.out::println);

            double sumSal = list.stream()
                    .filter(y -> y.getName().startsWith("M"))
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.print("Sum of salary of people whose name starts with 'M': " + sumSal);

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}
