package com.hillel.skalyga.lessons.lessons9;

public class Akerman {
    public static void main(String[] args) {

        System.out.println( demoAkerman(3, 2));
    }


    static int demoAkerman(int m, int n) {
        if (m==0){
            return n+1;
        }else if (m>0 && n==0){
            return demoAkerman(m-1,1);
        }else{
            return demoAkerman(m-1,demoAkerman(m,n-1));
        }
    }

}