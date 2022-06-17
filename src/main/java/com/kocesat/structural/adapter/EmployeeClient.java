package com.kocesat.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "Esat", "Koç", "abc@mail.com");
        employees.add(employeeFromDB);

        var employeeLdap = new EmployeeLDAP("11", "es", "ko", "ss@gmail.com");
        employees.add(new EmployeeAdapterLdap(employeeLdap));
        return employees;
    }
}
