package ru.peter.classes;

/**
 * Created by HP-PK on 24.03.2016.
 */
public class Palindrome {

    public static boolean checkPalindrome(String strIn) {

        StringBuilder strCheck = new StringBuilder(strIn.replaceAll("\\s", ""));
        if (strIn.equals(strCheck.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}
