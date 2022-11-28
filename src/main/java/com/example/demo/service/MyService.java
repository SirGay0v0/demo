package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class MyService {

    public String string(){
        String input = "СанктПетербургАстраханьМосква";
        String regex = "[а|А]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int str = matcher.group().length();

        return "";
    }
}
