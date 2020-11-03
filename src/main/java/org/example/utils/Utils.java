package org.example.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Utils {


    public void textOutput(Map<Integer,Double> costOfEachOrder,Double totalIncome)
            throws IOException {
        FileWriter fileWriter = new FileWriter("output");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.printf("Total income is %.2f %n ", totalIncome);
        printWriter.println();
        printWriter.println();
        printWriter.println();
        for(Integer i:costOfEachOrder.keySet()){
            printWriter.printf("Order with id: %s  cost of order:%.2f %n ",i,costOfEachOrder.get(i));
            printWriter.println();
        }


        printWriter.close();

    }



}
