package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {
    private final String teamName = "Equipo 2";

    public String answer(String question) {
        Matcher nameMatcher = Pattern.compile(".*what is your name").matcher(question);
        if (nameMatcher.matches()) {
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            String[] q = question.split(":");
            String[] val = q[2].split(",");
            if (Integer.parseInt(val[0].trim()) > Integer.parseInt(val[1].trim())){
                return val[0].trim();
            }else{
                return val[1].trim();
            }
        }
        
        return "";
    }



}