package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GenerateValue generateValue = new GenerateValue();
        IStringRowsListSorter task = new TaskImpl();
        /* generate test structure */
        List<String[]> masTest = new ArrayList<String[]>();
        for (int i = 0; i < 10; i++) {
            masTest.add(generateValue.generateRow(5));
        }
        task.print(masTest);
        System.out.println();
        task.sort(masTest, 1);
    }




}
