package com.bolotin;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Задание 1
        System.out.println("Задание 1");
        String fistName = "Ivan";
        String middleName = "Ivanovich";
        String lastleName = "Ivanov";
        String fullName = lastleName + " " + fistName + " " +  middleName;
        System.out.println("ФИО сотрудника — " + fullName);

//        Задание 2
        System.out.println("Задание 2");
        String s1 = fullName.toUpperCase();
        System.out.println("ФИО сотрудника для заполнения счета — " + s1);

//       Задание 3
        System.out.println("Задание 3");
        String s = "Иванов Семён Семёнович";
        String s2 = s.replace('ё', 'е');
        System.out.println(s2);

    }
}
