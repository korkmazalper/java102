package main;
import java.util.*;
import java.io.*;

class Main {

    public static String LongestWord(String sen) {
        // code goes here
        String longestWord="";
        String str="";
        String criteria=" 0123456789!§$%&/(){[]}<>|";
        for(int i=0;i<sen.length();i++){
            if(!criteria.contains(""+sen.charAt(i)) ){
                str+=sen.charAt(i);
            }else{
                if(str.length()>longestWord.length()){
                    longestWord=str;
                    str="";
                }
            }

        }
        if(str.length()>longestWord.length()){
            longestWord=str;}
        return longestWord;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord("fun&!! time"));
    }

}