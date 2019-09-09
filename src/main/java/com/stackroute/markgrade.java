package com.stackroute;

public class markgrade {

    public double avg(int marks[]){
        int len = marks.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum = sum +marks[i];
        }
        double avg =(double) (sum/len);

        return avg;
    }

    public int min(int marks[]){
        int len = marks.length;
        int min=marks[0];
        for (int i=0;i<len;i++){
            if(marks[i]<min){
                min = marks[i];
            }
        }
        return min;
    }

    public int max(int marks[]){
        int len = marks.length;
        int max=marks[0];
        for (int i=0;i<len;i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
        return max;
    }


}
