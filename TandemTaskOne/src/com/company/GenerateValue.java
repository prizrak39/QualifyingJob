package com.company;

import java.util.Random;

/**
 * Класс для генерации строк таблицы и
 * отдельных значений в таблице
 * Created by Prizrak on 17.03.2016.
 */
public class GenerateValue {

//    private SecureRandom random = new SecureRandom();

    /**
     * Генерирование строки таблицы
     * @param length
     * @return
     */
    public String[] generateRow(int length) {

        String[] row = new String[length];

        for (int i = 0; i < length; i++) {
            row[i] = generateString(10);
        }
        return row;
    }

    /**
     * Генерация случайной строки
     * @param len - длина строки
     * @return
     */
    private String generateString(int len) {
        String str = new String ("AQWER35TSDFGHJZXCVBN249357482013");
        StringBuilder temp = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < len; i++) {
//            System.out.println(str.charAt());
            temp.append(str.charAt(random.nextInt(str.length())));
        }
        //return new BigInteger(50, random).toString(10);
        return temp.toString();
    }
}
