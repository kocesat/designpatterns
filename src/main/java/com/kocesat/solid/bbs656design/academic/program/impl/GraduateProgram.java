package com.kocesat.solid.bbs656design.academic.program.impl;

import com.kocesat.solid.bbs656design.academic.Department;
import com.kocesat.solid.bbs656design.academic.program.Program;

public class GraduateProgram implements Program {
    private Department department;

    public GraduateProgram(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public void displayProgram() {
        System.out.println("Graduate Program of " + department.getName());
    }
}
