package ru.peter.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prizrak on 26.03.2016.
 */
public class Games {

    private List<Users> listUsers = new ArrayList<Users>();

    /**
     * Процедура осушествляет новый ход
     * @param nameUser - имя игрока делающего ход
     * @param strIn    - строка хода
     */
    public void newProccess(String nameUser, String strIn) {
        if (Palindrome.checkPalindrome(strIn)) {
            
        } else {

        }
    }
}
