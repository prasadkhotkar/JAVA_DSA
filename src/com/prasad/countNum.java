package com.prasad;

public class countNum {
    public static void main(String[] args) {
        int n=233334;
        int count=0;
        while(n>0){
            int reminder=n%10;
            if(reminder==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
