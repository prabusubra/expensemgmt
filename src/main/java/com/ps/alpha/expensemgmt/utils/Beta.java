package com.ps.alpha.expensemgmt.utils;

public class Beta {
    public static void main(String[] args) {
        EmployeeRecord er1 = new EmployeeRecord("Ram", 32);
        System.out.println("Result : "+er1);

        System.out.println("Result name : "+er1.name());
        System.out.println("Result age : "+er1.age());

        EmployeeRecord er2 = new EmployeeRecord("Ram", 32);

        System.out.println("Equals test : "+(er1.equals(er2)));

        System.out.println("Result : "+er1.age());

        System.out.println("Result : " + EmployeeRecord.getDefault());
    }
}

record EmployeeRecord(String name, int age) {
    public static String DEFAULT_PREFIX = "Mr. ";
    public static String DEFAULT_NAME = "AAA";
    public static int DEFAULT_AGE = 18;

    public static EmployeeRecord getDefault() {
        return new EmployeeRecord(DEFAULT_NAME, DEFAULT_AGE);
    }
}


sealed class Shape permits Circle, Square, Rectangle {

}

final class Circle extends Shape {

}

final class Square extends Shape {

}

final class Rectangle extends Shape {

}