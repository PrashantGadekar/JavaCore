package com.stackroute;

public class factorial {
    public String[] intfact(int n){
        if(n>13){
            n =13;
        }
        String[] str =new String[n];
        int i=0;
        if(n<13) {
            for ( i = 0; i < n; i++) {
                str[i] = "The factorial of " + (i + 1) + " is " + fact(i+1);
            }
        } else {
            for (i = 0; i < 12; i++) {
                str[i] = "The factorial of " + (i + 1) + " is " + fact(i+1);
            }
            str[i] = "The factorial of " + (i + 1) + " is " + "out of range";
        }

        return str;
    }

    public int fact(int i){
        if( i==0){
            return 1;
        }
        return fact(i-1)*i;
    }

    public String[] longfact(int n){
        if(n>21){
            n =21;
        }
        String[] str =new String[n];
        int i=0;
        if(n<20) {
            for ( i = 0; i < n; i++) {
                str[i] = "The factorial of " + (i + 1) + " is " + longfac(i+1);
            }
        } else {
            for (i = 0; i < 20; i++) {
                str[i] = "The factorial of " + (i + 1) + " is " + longfac(i+1);
            }
            str[i] = "The factorial of " + (i + 1) + " is " + "out of range";
        }

        return str;
    }


    public long longfac(long i){
        if( i==0){
            return 1;
        }
        return longfac(i-1)*i;
    }
}
