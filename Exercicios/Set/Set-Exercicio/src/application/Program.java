package application;

import model.entities.Course;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Course> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int qntA = sc.nextInt();
        for(int i=0; i<qntA; i++){
            System.out.print("Student: ");
            set.add (new Course(sc.nextInt()));
        }



        System.out.print("How many students for course B? ");
        int qntB = sc.nextInt();
        for(int i=0; i<qntB; i++){
            sc.nextLine();
            System.out.print("Student: ");
            set.add (new Course(sc.nextInt()));
        }


        System.out.print("How many students for course C? ");
        int qntC = sc.nextInt();
        for(int i=0; i<qntC; i++){
            sc.nextLine();
            System.out.print("Student: ");
            set.add (new Course(sc.nextInt()));
        }


        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
