package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("19. В строке удвоить все символы из диапазона согласных букв.\n");
        String old = new String();
        Scanner scn = new Scanner(System.in);
        System.out.println("Впиши слово или фразу : ");
        old=scn.next();
        int razmer = old.length();
        char[] chars=old.toCharArray();
        char[] consonants={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','z',
                'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','Z'};
        char[]result=new char[razmer*2];
        int t=0;
        boolean consonant=false;
        for (int i = 0; i < razmer; i++) {

            for (int j = 0; j <consonants.length ; j++) {
                consonant=false;
                if(chars[i]==consonants[j]){
                    consonant=true;
                    break ;
                }
            }
            if(consonant==true){
                result[t]=chars[i];
                result[t+1]=chars[i];
                t++;
                t++;
            }
            else {
                result[t]=chars[i];
                t++;
            }

        }
        System.out.println("Результат в варианте без изменений самой строки:");
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]);
        }




        String temp=new String();
        for (int i = 0; i <old.length() ; i++) {
            for (int j = 0; j < consonants.length; j++) {
                consonant=false;
                temp="";
                if(old.charAt(i)==consonants[j]){
                    consonant=true;
                    //break ;
                    if(consonant==true){
                        temp+=consonants[j];
                        old=old.replace(temp,temp+temp);
                        i++;
                        break;
                    }
                }

            }
        }
        System.out.println();
        System.out.println("Результат в варианте использования методов StringBuffer:\n"+old);
    }
}