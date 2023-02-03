package com.kocesat.solid.bbs656design.academic;

import com.kocesat.solid.bbs656design.academic.program.impl.GraduateProgram;
import com.kocesat.solid.bbs656design.academic.program.impl.UndergradProgram;

public class Main {
    public static void main(String[] args) {
        Department cs = new Department("Computer Science and Engineeering");
        UndergradProgram csUndergrad = new UndergradProgram(cs);
        GraduateProgram csGrad = new GraduateProgram(cs);
        Faculty facultyOfEngineering = new Faculty(csUndergrad); // can be modified to have more than one program
        Institute instituteOfEngineering = new Institute(csGrad); // can be modified to have more than one grad program
        University metu = new University();
        metu.addFaculty(facultyOfEngineering);
        metu.addInstitute(instituteOfEngineering);
        for (Faculty faculty : metu.getFacultyList()) {
            faculty.getProgram().displayProgram();
        }
        for (Institute institute : metu.getInstituteList()) {
            institute.getProgram().displayProgram();
        }
    }
}
