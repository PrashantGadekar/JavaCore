package com.stackroute;

public class power {
    public int isPower(int a){
        int k =3;
        if(a==1){
            k=0;
        } else {
            while(a!=1){
                a=a/4;
                if(a==0){
                    k=1;
                    break;
                } else{
                    k=0;
                }
            }
        }
     return k;
    }
}
