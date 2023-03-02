package com.hillel.skalyga.lessons.lessons9;

public class Person {
    public static void main(String[] args) {

        String person1=personInfo("Will ","Smith ","New York ","2936729462846");
        String person2=personInfo("Jackie ","Chan ","Shanghai ","12312412412");
        String person3=personInfo("Sherlock ","Holmes ","London ","37742123513");
        System.out.println(person1+"\n"+person2+"\n"+person3);
    }
   static String personInfo(String name , String  surname, String city, String phone){
        String info = "Call a citizen " + name + " " + surname + " from the city " + city + " you can by number " + phone + ".";
        return info;
    }
}
/*
Зробити клас Person та в ньому метод personInfo()
На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
Всередині методу формувати рядок у форматі:
Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
Метод має повертати String
У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
Повинен вийти висновок такого типу:
Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.
 */