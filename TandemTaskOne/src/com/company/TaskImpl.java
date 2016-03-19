package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prizrak on 16.03.2016.
 */
public class TaskImpl implements IStringRowsListSorter {

    // ваша реализация должна работать, как singleton. даже при использовании из нескольких потоков.
    public static final IStringRowsListSorter INSTANCE = new TaskImpl();

    @Override
    public void sort(final List<String[]> rows, final int columnIndex) {
        // напишите здесь свою реализацию. Мы ждем от вас хорошо структурированного, документированного и понятного кода.
        ArrayList<String> listColumn = new ArrayList<String>();
        for (String[] mas : rows) {
            listColumn.add(mas[columnIndex]);
        }

        System.out.println(listColumn.toString());
    }

    /**
     *
     * @param rows
     */
    public void print(final List<String[]> rows) {

        for (String[] mas : rows) {
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
            System.out.println();
        }
    }
}
