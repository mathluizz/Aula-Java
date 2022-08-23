package application;

import entities.Election;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path:");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Map<String, Integer> votes = new HashMap<>();
            String line = br.readLine();


            while(line != null){
                String[] fields = line.split(",");
                String key = fields[0];
                int value = Integer.parseInt(fields[1]);
                if (votes.containsKey(key)){
                   int soma = votes.get(key) + Integer.parseInt(fields[1]);
                    votes.put(key, soma);
                }else{
                    votes.put(key, value);
                }
                line = br.readLine();
            }
            for (String e : votes.keySet()){
                System.out.println(e + " : " + votes.get(e));
            }


        }catch(IOException e){
            System.out.println("Error");
        }
        sc.close();
    }
}
