package com.hackathon.npexample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HelloWorld  {

    public String greet(String name){
        String capitalizedName = name.toUpperCase();
        if(capitalizedName.isEmpty()) return "User Name can't be empty";
        return "Hello Mr./Ms "+capitalizedName;
    }

    public List<String> sortList(List<String> listOfNames){
        return listOfNames.stream().sorted().collect(Collectors.toList());
    }

}
