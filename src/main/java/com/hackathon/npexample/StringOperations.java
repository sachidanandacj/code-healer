package com.hackathon.npexample;

public class StringOperations {

    public boolean areStringsEqual(String str1, String str2){
        return str2.equals(str1);
    }

    public String getSubString(String str, int startIndex, int lastIndex){
        return str.substring(startIndex,lastIndex);
    }

    public int getLastIndexOf(String str, String strToSearchFor){
        return str.lastIndexOf(strToSearchFor);
    }
}
