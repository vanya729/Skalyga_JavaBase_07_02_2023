package com.hillel.skalyga.lessons.lessons13;

public class Androids implements Smartphones,OS {


    @Override
    public String getOS() {
        return "LinuxOS";
    }

    @Override
    public void call(String number) {
        System.out.println("Call number: "+number );
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Call number: "+number +"and sms: "+message);
    }

    @Override
    public void internet(String url) {
        System.out.println("web on internet: "+url);
    }
}

