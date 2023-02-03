package com.kocesat.solid.bbs656design.academic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Institute> instituteList = new ArrayList<Institute>();
    private List<Faculty> facultyList = new ArrayList<Faculty>();

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void addInstitute(Institute institute) {
        instituteList.add(institute);
    }

    public List<Institute> getInstituteList() {
        return List.copyOf(instituteList);
    }

    public List<Faculty> getFacultyList() {
        return List.copyOf(facultyList);
    }
}
