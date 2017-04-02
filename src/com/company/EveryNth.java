package com.company;

/**
 * Created by ridita on 4/2/17.
 */
public class EveryNth {
    public String everyNth(String str, int n) {

        String answerString = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                answerString += str.charAt(i);
            }
        }

        return answerString;

    }

}
