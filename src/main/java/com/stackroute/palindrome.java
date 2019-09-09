package com.stackroute;

public class palindrome {
    public int isPalindrome(String str){

        String[] strarr = str.split("");
        String[] strarr2 = new String[strarr.length];
        int j = strarr.length;
        j = j-1;
        for(int i=0; i<strarr.length;i++){
            strarr2[j-i] = strarr[i];
        }
       // for (String temp : strarr2){
         //   System.out.println(temp);
        //}
        int k=0;
        for(int i=0; i<strarr.length;i++){
            System.out.println(strarr2[i] + "=" +strarr[i]);
            if(strarr2[i].equals(strarr[i])){
                k=k+0;
            } else{
                k=k+1;
            }
        }

        if(k==0){
            k=0;
        }else{
            k =1;
        }

        return k;
    }
}
