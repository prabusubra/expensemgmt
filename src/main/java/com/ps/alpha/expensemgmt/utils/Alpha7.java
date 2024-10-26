package com.ps.alpha.expensemgmt.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Alpha7 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "IT", 100000, "AAA");
        Employee e2 = new Employee(2, "HR", 200000, "AAA");
        Employee e3 = new Employee(3, "IT", 300000, "AAA");
        Employee e4 = new Employee(4, "IT", 90000, "AAA");

        double avgSalray = Arrays.asList(e1, e2, e3, e4).stream()
                .collect(Collectors.groupingBy(d -> d.getDepartmentId(),
                        Collectors.averagingDouble(d -> d.getSalary())))
                .entrySet().stream().filter(data -> data.getKey().equals("HR"))
                .map(d -> d.getValue()).findAny().get();
               // .forEach((k, v) -> System.out.println("Key : "+k+ " value : "+v));
        System.out.println("Average Salary : "+avgSalray);
        List<Employee> result = Arrays.asList(e1, e2, e3, e4)
                .stream().filter(data -> data.getSalary() > avgSalray)
                .collect(Collectors.toList());
        System.out.println("result : "+result);

    }
}


@Data
@AllArgsConstructor
class Employee {
    private int id;
    private String departmentId;
    private double salary;

    private String name;

}