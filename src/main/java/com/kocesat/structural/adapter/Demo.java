package com.kocesat.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        var client = new EmployeeClient();
        var employees = client.getEmployeeList();
        employees.forEach(e -> System.out.println(e));
    }
}
