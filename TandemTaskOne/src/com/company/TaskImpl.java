package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        ArrayList<String> newList = new ArrayList<String>(listColumn.size());
        /* Сортировка полученного списка */
        for (String str : listColumn) {
            if (str.equals("")) {
                // Строка является пустой
                newList.add(0, str);
            } else {
                newList.add(str);
            }
            subStrSelection(str);
        }
        System.out.println(listColumn.toString());
    }

    /**
     * Выбор числовой подстроки
     * @param strIn
     * @return
     */
    private String subStrSelection(String strIn) {
        StringBuilder subStrNumber = new StringBuilder("");
        StringBuilder subStrChar = new StringBuilder("");

        // ищем первое вхождение цифры в строку
        Pattern patternNumber = Pattern.compile("\\d+");
        Matcher matcherNum = patternNumber.matcher(strIn);

        Pattern patternChar = Pattern.compile("\\D+");
        Matcher matcherChar = patternChar.matcher(strIn);
        System.out.println("Matcher strIn " + strIn);

        /* Выбираем подстроку цифр */
        while (matcherNum.find()) {
            //System.out.println("Matcher group " + matcher.group());
            subStrNumber.append(matcherNum.group());
        }
        /* Выбираем подстроку символов */
        while (matcherChar.find()) {
            subStrChar.append(matcherChar.group());
        }

        System.out.println("Substring number " + subStrNumber.toString());
        System.out.println("Substring char " + subStrChar.toString());

        for (int i = 0; i < strIn.length(); i++) {

        }

        return subStrNumber.toString();
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
