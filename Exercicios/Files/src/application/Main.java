package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String strFile = sc.nextLine(); //Caminho do arquivo

        File file = new File(strFile);
        String strFolder = file.getParent(); //Caminho da pasta
        //getParent: método para receber o path sem o arquivo (pasta)

        boolean success = new File(strFolder + "/out").mkdir(); //Criação da nova pasta

        String strNewFile = strFolder + "/out/summary.csv"; //Caminho do novo arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(strFile))){
            String itemCsv = br.readLine(); //Leitura da linha do arquivo txt
            while (itemCsv != null){ //Percorrendo as demais linhas
                String[] fields = itemCsv.split(","); //Quebrando os valores pelo ","
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(strNewFile))){
                for (Product item : list){
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(strNewFile + " Created");
            } catch (IOException e){
                System.out.println("Error writing file " + e.getMessage());
            }
        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}